package com.sia.obision.project.application.target

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toParam
import com.sia.obision.project.converter.target.toProto
import com.sia.obision.project.domain.TargetService.exists
import com.sia.obision.project.entity.target.Target
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.exception.CategoryNotFoundException
import com.sia.obision.project.exception.TargetNotFoundException
import com.sia.obision.project.param.target.TargetFilterParam
import com.sia.obision.project.param.target.TargetSearchParam
import com.sia.obision.project.repo.target.CategoryRepository
import com.sia.obision.project.repo.target.TargetRepository
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.target.v1.*
import java.lang.IllegalArgumentException

object TargetService {

  fun createTarget(request: CreateTargetRequestV1) {
    val targetParam = request.toParam()
    exists(targetParam.id)
    if (checkEmpty(
        targetParam.id,
        targetParam.name,
        targetParam.categoryId.toString())
    ) throw BadRequestException("id, name, category must exist")

    val targetRepository = injector().get<TargetRepository>()
    val categoryRepository = injector().get<CategoryRepository>()

    val category = try {
      categoryRepository.use {
        it.findOne(targetParam.categoryId)
      }
    } catch (e: NoSuchElementException) {
      throw CategoryNotFoundException("category does not exist")
    }

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

  fun createTargetList(request: CreateTargetListRequestV1) {
    request.targetList.forEach(::createTarget)
  }

  fun bookMark(request: BookMarkRequestV1) {
    val targetRepository = injector().get<TargetRepository>()

    if (checkEmpty(request.targetId)) throw BadRequestException("id must exist")
    try {
      targetRepository.use {
        val target = it.findOne(request.targetId)
        target.changeIsFavorite(request.isFavorite)
        it.save(target)
      }
    } catch (e: NoSuchElementException) {
      throw TargetNotFoundException("target does not exist")
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

  fun deleteTargetList(request: DeleteTargetListRequestV1) {
    request.idList.forEach(::deleteTarget)
  }

  fun updateTarget(request: UpdateTargetRequestV1) {
    val targetParam = request.toParam()
    if (checkEmpty(
        targetParam.currentId,
        targetParam.newId,
        targetParam.name)
    ) throw BadRequestException("id, name must exist")
    exists(targetParam.newId)

    val targetRepository = injector().get<TargetRepository>()
    val categoryRepository = injector().get<CategoryRepository>()

    try {
      val category = categoryRepository.use {
        it.findOne(targetParam.categoryId)
      }

      val target = Target(
        id = targetParam.newId,
        name = targetParam.name,
        mgrs = targetParam.mgrs,
        geography = targetParam.geography,
        be = targetParam.be,
        jdpi = targetParam.jdpi,
        category = category
      )
      targetRepository.use {
        it.delete(targetParam.currentId)
        it.save(target)
      }
    } catch (e: NoSuchElementException) {
      throw CategoryNotFoundException("category does not exist")
    }
  }

  fun targetSearch(request: TargetSearchRequestV1): TargetSearchResponseV1 {
    val targetRepository = injector().get<TargetRepository>()

    val targetSearchParam = TargetSearchParam(
      searchProperty = request.searchProperty.toParam(),
      paging = request.paging.toParam(),
      isFavorite = request.isFavorite,
      targetSortProperty = request.targetSortProperty.toEntity(),
      sortDirection = request.sortDirection.toEntity()
    )
    //    targetRepository.use {
    //      it.findAll().forEach {
    //        println("targetId: ${it.id}, name: ${it.name}, geography: ${it.geography}")
    //      }
    targetRepository.use {
      it.targetSearch(targetSearchParam).forEach {
        println("targetId: ${it.targetId}, targetName: ${it.name}, categoryId: ${null}, mainCategory: ${it.mainCategory}, middleCategory: ${it.middleCategory}, subCategory: ${it.subCategory}")
      }
    }
    return TargetSearchResponseV1.getDefaultInstance()
  }

  fun targetFilter(request: TargetFilterRequestV1): TargetFilterResponseV1 {
    val targetFilterParam = TargetFilterParam(
      filterProperty = request.filterProperty.toParam(),
      paging = request.paging.toParam(),
      targetSortProperty = request.targetSortProperty.toParam(),
      sortDirection = request.sortDirection.toProto()
    )
    return TargetFilterResponseV1.getDefaultInstance()
  }
}




