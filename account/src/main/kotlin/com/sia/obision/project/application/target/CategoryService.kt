package com.sia.obision.project.application.target

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toParam
import com.sia.obision.project.converter.target.toParma
import com.sia.obision.project.converter.target.toProto
import com.sia.obision.project.domain.CategoryService.checkExistCategory
import com.sia.obision.project.entity.target.Category
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.exception.CategoryNotFoundException
import com.sia.obision.project.repo.target.CategoryRepository
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.project.util.specialCharacterCheck
import com.sia.obision.target.v1.category.*
import java.lang.IllegalArgumentException
import java.util.*
import kotlin.NoSuchElementException

object CategoryService {

    fun createCategory(request: CreateCategoryRequestV1): CreateCategoryResponseV1 {
        if (checkEmpty(request.mainCategory)) throw BadRequestException("mainCategory must exist")
        specialCharacterCheck(request.mainCategory, request.middleCategory, request.subCategory)
        val categoryParam = request.toParam()
        checkExistCategory(categoryParam.mainCategory, categoryParam.middleCategory, categoryParam.subCategory)

        val categoryRepository = injector().get<CategoryRepository>()
        val category = Category(
            mainCategory = categoryParam.mainCategory,
            middleCategory = categoryParam.middleCategory,
            subCategory = categoryParam.subCategory
        )

        categoryRepository.use {
            it.save(category)
        }
        return CreateCategoryResponseV1.newBuilder()
            .setId(category.id!!.toProto())
            .build()
    }

    fun createCategoryList(request: CreateCategoryListRequestV1): CreateCategoryListResponseV1 {
        val categoryRepository = injector().get<CategoryRepository>()
        val categoryList = mutableListOf<Category>()
        request.categoryList.forEach {
            if (checkEmpty(it.mainCategory)) throw BadRequestException("mainCategory must exist")
            specialCharacterCheck(it.mainCategory, it.middleCategory, it.subCategory)
            val categoryParam = it.toParam()
            checkExistCategory(categoryParam.mainCategory, categoryParam.middleCategory, categoryParam.subCategory)
            val category = Category(
                mainCategory = categoryParam.mainCategory,
                middleCategory = categoryParam.middleCategory,
                subCategory = categoryParam.subCategory
            )
            categoryList.add(category)
        }

        categoryRepository.use {
            it.save(categoryList)
        }

        return CreateCategoryListResponseV1.newBuilder()
            .addAllCategory(
                categoryList.map {
                    CreateCategoryResponseV1.newBuilder()
                        .setId(it.id!!.toProto())
                        .build()
                }
            ).build()
    }

    fun findCategory(categoryId: UUID): Category {
        injector().get<CategoryRepository>().use {
            try {
                return it.findOne(categoryId)
            } catch (e: NoSuchElementException) {
                throw CategoryNotFoundException("$categoryId does not exist")
            }
        }
    }

    fun getCategoryList(): GetCategoryListResponseV1 {
        val categoryListProto = GetCategoryListResponseV1.newBuilder()
        val categoryRepository = injector().get<CategoryRepository>()
        categoryRepository.use {
            it.findAll()
        }.forEach { categoryListProto.addCategory(it.toProto()) }
        return categoryListProto.build()
    }

    fun deleteCategory(request: DeleteCategoryRequestV1) {
        if (checkEmpty(request.toString())) throw BadRequestException("id must exist")
        val id = request.id.toEntity()
        val categoryRepository = injector().get<CategoryRepository>()

        try {
            categoryRepository.use {
                it.delete(id)
            }
        } catch (e: IllegalArgumentException) {
            throw CategoryNotFoundException("$id does not exist")
        }
    }

    fun deleteCategoryList(request: DeleteCategoryListRequestV1) {
        request.categoryList.forEach(::deleteCategory)
    }

    fun updateCategory(request: UpdateCategoryRequestV1) {
        if (checkEmpty(
                request.id.toString(),
                request.mainCategory
            )
        ) throw BadRequestException("id, mainCategory must exist")
        specialCharacterCheck(request.mainCategory, request.middleCategory, request.subCategory)
        val categoryParam = request.toParma()
        val categoryRepository = injector().get<CategoryRepository>()
        try {
            categoryRepository.use {
                val category = it.findOne(categoryParam.id)
                category.update(
                    mainCategory = categoryParam.mainCategory,
                    middleCategory = categoryParam.middleCategory,
                    subCategory = categoryParam.subCategory
                )
                it.save(category)
            }
        } catch (e: NoSuchElementException) {
            throw CategoryNotFoundException("${categoryParam.id} does not exist")
        }
    }
}
