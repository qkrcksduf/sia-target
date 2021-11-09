package com.sia.obision.project.application.target

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.application.target.CategoryService.findCategory
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toParam
import com.sia.obision.project.converter.target.toProto
import com.sia.obision.project.domain.TargetService.checkExistTarget
import com.sia.obision.project.entity.target.Target
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.exception.IdDuplicationException
import com.sia.obision.project.exception.TargetNotFoundException
import com.sia.obision.project.param.target.TargetFilterParam
import com.sia.obision.project.param.target.TargetSearchParam
import com.sia.obision.project.repo.target.TargetRepository
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.project.util.specialCharacterCheck
import com.sia.obision.target.v1.target.*
import org.hibernate.NonUniqueObjectException
import java.lang.IllegalArgumentException
import javax.transaction.Transactional

object TargetService {

    fun findTarget(name: String): Target {
        injector().get<TargetRepository>().use {
            return it.findByName(name) ?: throw TargetNotFoundException("target does not exist")
        }
    }

    fun createTarget(request: CreateTargetRequestV1) {
        if (checkEmpty(
                request.id,
                request.name,
                request.categoryId.toString()
            )
        ) throw BadRequestException("id, name, category must exist")
        specialCharacterCheck(request.id, request.name)

        val targetParam = request.toParam()
        checkExistTarget(targetParam.id)

        val targetRepository = injector().get<TargetRepository>()
        val category = findCategory(targetParam.categoryId)

        val target = Target(
            id = targetParam.id,
            name = targetParam.name,
            mgrs = targetParam.mgrs,
            geography = targetParam.geography,
            be = targetParam.be,
            jdpi = targetParam.jdpi,
            category = category
        )

        targetRepository.use {
            it.save(target)
        }
    }

    @Transactional
    fun createTargetList(request: CreateTargetListRequestV1) {
        val targetList = mutableListOf<Target>()
        val targetRepository = injector().get<TargetRepository>()

        request.targetList.forEach {
            if (checkEmpty(
                    it.id,
                    it.name,
                    it.categoryId.toString()
                )
            ) throw BadRequestException("id, name, category must exist")
            specialCharacterCheck(it.id, it.name)

            val targetParam = it.toParam()
            checkExistTarget(targetParam.id)

            val category = findCategory(targetParam.categoryId)
            val target = Target(
                id = targetParam.id,
                name = targetParam.name,
                mgrs = targetParam.mgrs,
                geography = targetParam.geography,
                be = targetParam.be,
                jdpi = targetParam.jdpi,
                category = category
            )
            targetList.add(target)

            val hashTarget = targetList.map { it.id }.toHashSet()
            if (targetList.size != hashTarget.size) {
                val message = "표적을 생성할 수 없습니다. 이미 존재하는 표적 ID 입니다."
                throw IdDuplicationException(message)
            }
        }
        targetRepository.save(targetList)
    }

    fun bookMark(request: TargetBookMarkRequestV1) {
        val targetRepository = injector().get<TargetRepository>()
        if (checkEmpty(request.targetId)) throw BadRequestException("id must exist")
        try {
            targetRepository.use {
                val target = it.findOne(request.targetId)
                target.changeIsFavorite(request.isFavorite)
                it.save(target)
            }
        } catch (e: NoSuchElementException) {
            throw TargetNotFoundException("${request.targetId} does not exist")
        }
    }

    fun deleteTarget(request: DeleteTargetRequestV1) {
        if (checkEmpty(request.id)) throw BadRequestException("id must exist")
        val targetRepository = injector().get<TargetRepository>()

        try {
            targetRepository.use {
                it.delete(request.id)
            }
        } catch (e: IllegalArgumentException) {
            throw TargetNotFoundException("target does not exist")
        }
    }

    @Transactional
    fun deleteTargetList(request: DeleteTargetListRequestV1) {
        request.idList.forEach(::deleteTarget)
    }

    @Suppress("ThrowsCount")
    fun updateTarget(request: UpdateTargetRequestV1) {
        if (checkEmpty(
                request.currentId,
                request.name,
                request.categoryId.toString()
            )
        ) throw BadRequestException("currentId, name, categoryId must exist")
        specialCharacterCheck(request.newId, request.name)

        val targetParam = request.toParam()

        if (targetParam.newId != null) {
            checkExistTarget(targetParam.newId)
        }

        val category = findCategory(targetParam.categoryId)

        try {
            val target = injector().get<TargetRepository>().use {
                it.findOne(targetParam.currentId)
            }

            val updateTarget = target.copy(
                id = targetParam.newId ?: targetParam.currentId,
                name = targetParam.name,
                mgrs = targetParam.mgrs,
                geography = targetParam.geography,
                be = targetParam.be,
                jdpi = targetParam.jdpi,
                category = category
            )

            injector().get<TargetRepository>().use {
                it.delete(targetParam.currentId)
                it.save(updateTarget)
            }
        } catch (e: NoSuchElementException) {
            throw TargetNotFoundException("target does not exist")
        }
    }

    fun targetSearch(request: TargetSearchRequestV1): TargetSearchResponseV1 {
        QlrmService.test()
        val targetRepository = injector().get<TargetRepository>()
        val targetSearchProto = TargetSearchResponseV1.newBuilder()

        specialCharacterCheck(request.searchProperty.id, request.searchProperty.name)

        val targetSearchParam = TargetSearchParam(
            searchProperty = request.searchProperty.toParam(),
            paging = request.paging.toParam(),
            isFavorite = request.isFavorite,
            targetSortProperty = request.targetSortProperty.toEntity(),
            sortDirection = request.sortDirection.toEntity()
        )

        targetRepository.use {
            targetSearchProto.totalCount = it.getSearchTotalCount(targetSearchParam)
            it.targetSearch(targetSearchParam)
        }.forEach {
            targetSearchProto.addTarget(it.toProto())
        }
        return targetSearchProto.build()
    }

    fun targetFilter(request: TargetFilterRequestV1): TargetFilterResponseV1 {
        val targetRepository = injector().get<TargetRepository>()
        val targetFilterProto = TargetFilterResponseV1.newBuilder()

        val targetFilterParam = TargetFilterParam(
            filterProperty = request.filterProperty.toParam(),
            isFavorite = request.selectOption.isFavorite,
            targetSortProperty = request.targetSortProperty.toEntity(),
            sortDirection = request.sortDirection.toEntity(),
            paging = request.paging.toParam()
        )

        targetRepository.use {
            targetFilterProto.totalCount = it.getFilterTotalCount(targetFilterParam)
            it.targetFilter(targetFilterParam)
        }.forEach {
            targetFilterProto.addTarget(it.toProto())
        }
        return targetFilterProto.build()
    }
}
