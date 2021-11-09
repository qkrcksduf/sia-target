package com.sia.obision.project.application.target

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.application.target.TargetService.findTarget
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toParam
import com.sia.obision.project.converter.target.toProto
import com.sia.obision.project.entity.target.Record
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.exception.RecordNotFoundException
import com.sia.obision.project.param.target.RecordFilterParam
import com.sia.obision.project.param.target.RecordSearchParam
import com.sia.obision.project.repo.target.RecordRepository
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.project.util.specialCharacterCheck
import com.sia.obision.target.v1.record.*
import java.lang.IllegalArgumentException

object RecordService {

    fun createRecord(request: CreateRecordRequestV1): CreateRecordResponseV1 {
        if (checkEmpty(request.targetName, request.contents, request.creator))
            throw BadRequestException("targetName, contents, creator must exist")
        specialCharacterCheck(request.targetName, request.creator, request.contents)

        val createRecordParam = request.toParam()
        val target = findTarget(createRecordParam.targetName)

        val record = Record(
            contents = createRecordParam.contents,
            creator = createRecordParam.creator,
            isEmergency = createRecordParam.isEmergency,
            target = target
        )

        injector().get<RecordRepository>().use {
            it.save(record)
        }

        return CreateRecordResponseV1.newBuilder()
            .setId(record.id!!.toProto())
            .build()
    }

    fun updateRecord(request: UpdateRecordRequestV1) {
        if (checkEmpty(request.targetName, request.contents))
            throw BadRequestException("targetName, contents must exist")
        specialCharacterCheck(request.targetName, request.contents)

        val updateRecordParam = request.toParam()
        val target = findTarget(updateRecordParam.targetName)

        val record = try {
            injector().get<RecordRepository>().use {
                it.findOne(updateRecordParam.id)
            }
        } catch (e: NoSuchElementException) {
            throw RecordNotFoundException("${updateRecordParam.id} does not exist")
        }

        injector().get<RecordRepository>().use {
            val updateRecord = record.copy(
                target = target,
                contents = updateRecordParam.contents,
                isEmergency = updateRecordParam.isEmergency
            )
            it.save(updateRecord)
        }
    }

    fun deleteRecord(request: DeleteRecordRequestV1) {
        if (checkEmpty(request.toString())) throw BadRequestException("id must exist")
        val id = request.id.toEntity()
        try {
            injector().get<RecordRepository>().use {
                it.delete(id)
            }
        } catch (e: IllegalArgumentException) {
            throw RecordNotFoundException("$id does not exist")
        }
    }

    fun bookMark(request: RecordBookMarkRequestV1) {
        if (checkEmpty(request.recordId.toString())) throw BadRequestException("id must exist")
        val id = request.recordId.toEntity()
        try {
            injector().get<RecordRepository>().use {
                val record = it.findOne(id)
                record.changeIsFavorite(request.isFavorite)
                it.save(record)
            }
        } catch (e: NoSuchElementException) {
            throw RecordNotFoundException("$id does not exist")
        }
    }

    fun recordFilter(request: RecordFilterRequestV1): RecordFilterResponseV1 {
        val recordRepository = injector().get<RecordRepository>()
        val recordFilterProto = RecordFilterResponseV1.newBuilder()

        val recordFilterParam = RecordFilterParam(
            filterProperty = request.filterProperty.toParam(),
            selectOption = request.selectOption.toParam(),
            recordSortProperty = request.recordSortProperty.toEntity(),
            sortDirection = request.sortDirection.toEntity(),
            paging = request.paging.toParam()
        )

        recordRepository.use {
            recordFilterProto.totalCount = it.getFilterTotalCount(recordFilterParam)
            it.recordFilter(recordFilterParam)
        }.forEach {
            recordFilterProto.addRecord(it.toProto())
        }

        return recordFilterProto.build()
    }

    fun recordSearch(request: RecordSearchRequestV1): RecordSearchResponseV1 {
        val recordRepository = injector().get<RecordRepository>()
        val recordSearchProto = RecordSearchResponseV1.newBuilder()

        specialCharacterCheck(
            request.searchProperty.targetName,
            request.searchProperty.creator,
            request.searchProperty.contents)

        val recordSearchParam = RecordSearchParam(
            searchProperty = request.searchProperty.toParam(),
            paging = request.paging.toParam(),
            selectOption = request.selectOption.toParam(),
            sortDirection = request.sortDirection.toEntity(),
            recordSortProperty = request.recordSortProperty.toEntity()
        )

        recordRepository.use {
            recordSearchProto.totalCount = it.getSearchTotalCount(recordSearchParam)
            it.recordSearch(recordSearchParam)
        }.forEach {
            recordSearchProto.addRecord(it.toProto())
        }

        return recordSearchProto.build()
    }
}
