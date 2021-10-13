package com.sia.obision.project.service

import com.google.protobuf.Empty
import com.sia.obision.project.application.target.TargetService
import com.sia.obision.target.TargetRouterGrpcKt
import com.sia.obision.target.v1.*
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class TargetRouteService : TargetRouterGrpcKt.TargetRouterCoroutineImplBase() {

  override suspend fun createTarget(request: CreateTargetRequestV1): Empty {
    try {
      TargetService.createTarget(request)
      return Empty.getDefaultInstance()
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }

  override suspend fun createTargetList(request: CreateTargetListRequestV1): Empty {
    try {
      TargetService.createTargetList(request)
      return Empty.getDefaultInstance()
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }

  override suspend fun targetSearch(request: TargetSearchRequestV1): TargetSearchResponseV1 {
    try {
      return TargetService.targetSearch(request)
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }

  override suspend fun targetFilter(request: TargetFilterRequestV1): TargetFilterResponseV1 {
    try {
      return TargetService.targetFilter(request)
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }

  override suspend fun updateTarget(request: UpdateTargetRequestV1): Empty {
    try {
      TargetService.updateTarget(request)
      return Empty.getDefaultInstance()
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }

  override suspend fun deleteTarget(request: DeleteTargetRequestV1): Empty {
    try {
      TargetService.deleteTarget(request)
      return Empty.getDefaultInstance()
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }

  override suspend fun deleteTargetList(request: DeleteTargetListRequestV1): Empty {
    try {
      TargetService.deleteTargetList(request)
      return Empty.getDefaultInstance()
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }

  override suspend fun bookMark(request: BookMarkRequestV1): Empty {
    try {
      TargetService.bookMark(request)
      return Empty.getDefaultInstance()
    } catch (e: Exception) {
      logger.error(e.stackTraceToString())
      throw e
    }
  }
}
