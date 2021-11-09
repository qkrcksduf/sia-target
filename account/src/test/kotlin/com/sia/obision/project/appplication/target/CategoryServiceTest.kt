package com.sia.obision.project.application.target

import com.sia.core.dependencyinjection.injector
import com.sia.core.kotlin.ex.close
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toProto

import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.exception.CategoryDuplicationException
import com.sia.obision.project.exception.CategoryNotFoundException
import com.sia.obision.project.repo.target.CategoryRepository
import com.sia.obision.target.v1.category.*
import com.sia.obision.target.v1.category.DeleteCategoryListRequestV1
import com.sia.obision.target.v1.category.DeleteCategoryRequestV1
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import java.util.*

class CategoryServiceTest : FunSpec({

    val categoryService = CategoryService
    val categoryRepository = injector().get<CategoryRepository>()

    afterEach {
        categoryRepository.deleteAll()
    }

    afterSpec {
        close(categoryRepository)
    }

    context("카테고리 생성 테스트") {
        test("카테고리를 정상적으로 생성할 수 있다.") {
            // given
            val category = createCategoryProto("대분류", "중분류", "소분류")

            // when
            val categoryProto = categoryService.createCategory(category)
            val findCategory = categoryRepository.findOne(categoryProto.id.toEntity())

            // then
            categoryProto.id.toEntity() shouldBe findCategory.id
            "대분류" shouldBe findCategory.mainCategory
            "중분류" shouldBe findCategory.middleCategory
            "소분류" shouldBe findCategory.subCategory
        }

        test("카테고리의 필수속성(mainCategory)가 없을 경우 BadRequestException이 발생한다.") {
            // given
            val category = createCategoryProto("", "", "")

            // when, then
            shouldThrow<BadRequestException> { categoryService.createCategory(category) }
        }

        test("카테고리가 이미 존재하는 경우 CategoryDuplicationException이 발생한다.") {
            // given
            val category1 = createCategoryProto("대분류", "중분류", "소분류")
            val category2 = createCategoryProto("대분류", "중분류", "소분류")

            // when, then
            categoryService.createCategory(category1)
            shouldThrow<CategoryDuplicationException> { categoryService.createCategory(category2) }
        }
    }

    context("카테고리 목록 생성 테스트") {
        test("카테고리 목록을 정상적으로 생성할 수 있다.") {
            // given
            val categoryList = createCategoryListProto()

            // when
            val categoryProto = categoryService.createCategoryList(categoryList)
            val findCategory = categoryRepository.findOne(categoryProto.getCategory(0).id.toEntity())

            // then
            categoryProto.getCategory(0).id.toEntity() shouldBe findCategory.id
            "대분류" shouldBe findCategory.mainCategory
            "중분류" shouldBe findCategory.middleCategory
            "소분류" shouldBe findCategory.subCategory
        }
    }

    context("카테고리 수정 테스트") {
        test("카테고리의 항목을 정상적으로 변경할 수 있다.") {
            // given
            val categoryProto = createCategoryProto("대분류", "중분류", "소분류")
            val categoryId = categoryService.createCategory(categoryProto).id.toEntity()
            val updateCategory = categoryUpdateProto(categoryId, "대분류", "중분류", "소분류")

            // when
            categoryService.updateCategory(updateCategory)
            val findCategory = categoryRepository.findOne(categoryId)

            // then
            updateCategory.id.toEntity() shouldBe findCategory.id
            updateCategory.mainCategory shouldBe findCategory.mainCategory
            updateCategory.middleCategory shouldBe findCategory.middleCategory
            updateCategory.subCategory shouldBe findCategory.subCategory
        }

        test("카테고리 변경의 필수항목(categoryId, mainCategory)가 없을 경우 BadRequestExceptiond이 발생한다.") {
            // given
            val categoryProto = categoryUpdateProto(UUID.randomUUID(), "", "", "")

            // when, then
            shouldThrow<BadRequestException> { categoryService.updateCategory(categoryProto) }
        }

        test("존재하지 않는 categoryId 입력시 CategoryNotFoundException이 발생한다.") {
            // given
            val categoryId = UUID.randomUUID()
            val updateCategory = categoryUpdateProto(categoryId, "대분류", "중분류", "소분류")

            // when, then
            shouldThrow<CategoryNotFoundException> { categoryService.updateCategory(updateCategory) }
        }
    }

    context("카테고리 삭제 테스트") {
        test("카테고리를 정상적으로 삭제할 수 있다.") {
            // given
            val categoryProto = createCategoryProto("대분류", "중분류", "소분류")
            val category = categoryService.createCategory(categoryProto)
            val categoryId = deleteCategoryProto(category.id.toEntity())

            // when, then
            should { categoryService.deleteCategory(categoryId) }
        }

        test("존재하지 않는 categoryId 입력 시 CategoryNotFoundException이 발생한다.") {
            // given
            val categoryId = deleteCategoryProto(UUID.randomUUID())

            // when, then
            shouldThrow<CategoryNotFoundException> { categoryService.deleteCategory(categoryId) }
        }
    }

    context("카테고리 목록 삭제 테스트") {
        test("카테고리 목록을 정상적으로 삭제할 수 있다.") {
            // given
            val categoryProto1 = createCategoryProto("대분류1", "중분류1", "소분류1")
            val categoryProto2 = createCategoryProto("대분류2", "중분류2", "소분류2")
            val category1 = categoryService.createCategory(categoryProto1)
            val category2 = categoryService.createCategory(categoryProto2)
            val categoryIdList = deleteCategoryListProto(category1.id.toEntity(), category2.id.toEntity())

            // when, then
            should { categoryService.deleteCategoryList(categoryIdList) }
        }
    }

    context("카테고리 목록 조회 테스트") {
        test("카테고리 목록을 정상적으로 조회할 수 있다.") {
            // given
            val categoryProto1 = createCategoryProto("대분류1", "중분류1", "소분류1")
            val categoryProto2 = createCategoryProto("대분류2", "중분류2", "소분류2")
            val category1 = categoryService.createCategory(categoryProto1)
            val category2 = categoryService.createCategory(categoryProto2)

            // when
            val categoryList = categoryService.getCategoryList()

            // then
            category1.id shouldBe categoryList.categoryList[0].id
            "대분류1" shouldBe categoryList.categoryList[0].mainCategory
            "중분류1" shouldBe categoryList.categoryList[0].middleCategory
            "소분류1" shouldBe categoryList.categoryList[0].subCategory

            category2.id shouldBe categoryList.categoryList[1].id
            "대분류2" shouldBe categoryList.categoryList[1].mainCategory
            "중분류2" shouldBe categoryList.categoryList[1].middleCategory
            "소분류2" shouldBe categoryList.categoryList[1].subCategory
        }
    }
})

private fun deleteCategoryListProto(vararg categoryId: UUID) =
    DeleteCategoryListRequestV1.newBuilder()
        .addCategory(deleteCategoryProto(categoryId[0]))
        .addCategory(deleteCategoryProto(categoryId[1]))
        .build()

private fun deleteCategoryProto(categoryId: UUID?) =
    DeleteCategoryRequestV1.newBuilder()
        .setId(categoryId?.toProto())
        .build()

private fun categoryUpdateProto(
    categoryId: UUID,
    mainCategory: String?,
    middleCategory: String?,
    subCategory: String?
) =
    UpdateCategoryRequestV1.newBuilder()
        .setId(categoryId.toProto())
        .setMainCategory(mainCategory)
        .setMiddleCategory(middleCategory)
        .setSubCategory(subCategory)
        .build()

private fun createCategoryListProto() =
    CreateCategoryListRequestV1.newBuilder()
        .addCategory(createCategoryProto("대분류", "중분류", "소분류"))
        .build()

private fun createCategoryProto(mainCategory: String?, middleCategory: String?, subCategory: String?) =
    CreateCategoryRequestV1.newBuilder()
        .setMainCategory(mainCategory)
        .setMiddleCategory(middleCategory)
        .setSubCategory(subCategory)
        .build()
