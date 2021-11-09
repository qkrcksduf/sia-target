package com.sia.obision.project.service

import com.google.protobuf.Empty
import com.sia.obision.project.application.target.AttachService
import com.sia.obision.target.AttachRouterGrpcKt
import com.sia.obision.target.v1.attach.*
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

@SuppressWarnings("TooGenericExceptionCaught")
class AttachRouteService : AttachRouterGrpcKt.AttachRouterCoroutineImplBase() {

    override suspend fun uploadAttach(request: UploadAttachRequestV1): UploadAttachResponseV1 {
        try {
            return AttachService.uploadAttach(request)
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun downloadAttach(request: DownloadAttachRequestV1): DownloadAttachResponseV1 {
        try {
            return AttachService.downloadAttach(request)
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun deleteAttach(request: DeleteAttachRequestV1): Empty {
        try {
            AttachService.deleteAttach(request)
            return Empty.getDefaultInstance()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }
}
