package com.sia.obision.project.service

import com.google.protobuf.Empty
import com.sia.obision.project.application.target.RecordService
import com.sia.obision.target.RecordRouterGrpcKt
import com.sia.obision.target.v1.record.*
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

@SuppressWarnings("TooGenericExceptionCaught")
class RecordRouteService : RecordRouterGrpcKt.RecordRouterCoroutineImplBase() {
    override suspend fun createRecord(request: CreateRecordRequestV1): CreateRecordResponseV1 {
        try {
            return RecordService.createRecord(request)
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun updateRecord(request: UpdateRecordRequestV1): Empty {
        try {
            RecordService.updateRecord(request)
            return Empty.getDefaultInstance()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun deleteRecord(request: DeleteRecordRequestV1): Empty {
        try {
            RecordService.deleteRecord(request)
            return Empty.getDefaultInstance()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun bookMark(request: RecordBookMarkRequestV1): Empty {
        try {
            RecordService.bookMark(request)
            return Empty.getDefaultInstance()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun recordFilter(request: RecordFilterRequestV1): RecordFilterResponseV1 {
        try {
            return RecordService.recordFilter(request)
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun recordSearch(request: RecordSearchRequestV1): RecordSearchResponseV1 {
        try {
            return RecordService.recordSearch(request)
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }
}
