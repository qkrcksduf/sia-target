package com.sia.obision.project.service

import com.google.protobuf.Empty
import com.sia.obision.project.application.target.CategoryService
import com.sia.obision.target.CategoryRouterGrpcKt
import com.sia.obision.target.v1.category.*
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

@SuppressWarnings("TooGenericExceptionCaught")
class CategoryRouteService : CategoryRouterGrpcKt.CategoryRouterCoroutineImplBase() {

    override suspend fun createCategory(request: CreateCategoryRequestV1): CreateCategoryResponseV1 {
        try {
            return CategoryService.createCategory(request)
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun createCategoryList(request: CreateCategoryListRequestV1): CreateCategoryListResponseV1 {
        try {
            return CategoryService.createCategoryList(request)
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun getCategoryList(request: Empty): GetCategoryListResponseV1 {
        try {
            return CategoryService.getCategoryList()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun updateCategory(request: UpdateCategoryRequestV1): Empty {
        try {
            CategoryService.updateCategory(request)
            return Empty.getDefaultInstance()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun deleteCategory(request: DeleteCategoryRequestV1): Empty {
        try {
            CategoryService.deleteCategory(request)
            return Empty.getDefaultInstance()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }

    override suspend fun deleteCategoryList(request: DeleteCategoryListRequestV1): Empty {
        try {
            CategoryService.deleteCategoryList(request)
            return Empty.getDefaultInstance()
        } catch (e: Exception) {
            logger.error(e.stackTraceToString())
            throw e
        }
    }
}
