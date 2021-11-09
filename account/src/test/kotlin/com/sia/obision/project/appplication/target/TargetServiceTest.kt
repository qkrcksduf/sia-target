package com.sia.obision.project.application.target

import com.google.protobuf.Timestamp
import com.sia.common.Paging
import com.sia.common.SortDirection
import com.sia.common.TimestampRange
import com.sia.core.dependencyinjection.injector
import com.sia.core.kotlin.ex.close
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toProto
import com.sia.obision.project.entity.target.Category
import com.sia.obision.project.exception.*
import com.sia.obision.project.repo.target.CategoryRepository
import com.sia.obision.project.repo.target.TargetRepository
import com.sia.obision.target.v1.FilterProperty
import com.sia.obision.target.v1.target.*
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import java.util.*
import java.util.UUID.randomUUID

class TargetServiceTest : FunSpec({
    val targetService = TargetService
    val targetRepository = injector().get<TargetRepository>()
    val categoryRepository = injector().get<CategoryRepository>()

    afterEach {
        targetRepository.deleteAll()
        categoryRepository.deleteAll()
    }

    afterSpec {
        close(targetRepository, categoryRepository)
    }

    context("표적 생성 테스트") {
        test("표적을 정상적으로 생성할 수 있다.") {
            // given
            val category =
                categoryRepository.save(Category(mainCategory = "메인", middleCategory = "미들", subCategory = "서브"))
            val request = createTargetRequestProto("target", "target", category.id)

            // when
            targetService.createTarget(request)
            val target = targetRepository.findOne("target")

            // then
            "target" shouldBe target.id
            "target" shouldBe target.name
            category.id shouldBe target.category.id
        }

        test("표적의 필수속성(id, name, categoryId)이 없을 경우 BadRequestException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)
            val request = createTargetRequestProto(null, "target", category.id)

            // when, then
            shouldThrow<BadRequestException> { targetService.createTarget(request) }
        }

        test("표적의 id, name에 특수문자가 결합될 시 BadReqeustException이 발생한다.") {
            // given
            val category =
                categoryRepository.save(Category(mainCategory = "메인", middleCategory = "미들", subCategory = "서브"))
            val request = createTargetRequestProto("tar_get", "target", category.id)

            // when, then
            shouldThrow<BadRequestException> { targetService.createTarget(request) }
        }

        test("표적의 id가 중복될 경우 IdDuplicationException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)
            val request1 = createTargetRequestProto("target", "target", category.id)
            val request2 = createTargetRequestProto("target", "target1", category.id)

            // when, then
            targetService.createTarget(request1)
            shouldThrow<IdDuplicationException> { targetService.createTarget(request2) }
        }

        test("표적의 name이 중복될 경우 NameDuplicationException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)

            val request1 = createTargetRequestProto("target", "target", category.id)
            val request2 = createTargetRequestProto("target1", "target", category.id)

            // when, then
            targetService.createTarget(request1)
            shouldThrow<NameDuplicationException> { targetService.createTarget(request2) }
        }

        test("존재하지 않는 categoryId 입력시 CategoryNotFoundException이 발생한다.") {
            // given
            val categoryId = randomUUID()
            val request = createTargetRequestProto("target", "target", categoryId)

            // when, then
            shouldThrow<CategoryNotFoundException> { targetService.createTarget(request) }
        }
    }
    context("표적 목록 생성 테스트") {
        test("표적 목록을 정상적으로 생성할 수 있다.") {
            // given
            val category = createCategory(categoryRepository)
            val target1 = createTargetRequestProto("target1", "target1", category.id)
            val target2 = createTargetRequestProto("target2", "target2", category.id)
            val targetProtoList = listOf(target1, target2)
            val request = createTargetListRequestProto(targetProtoList)

            // when
            targetService.createTargetList(request)
            val findTarget1 = targetRepository.findOne("target1")
            val findTarget2 = targetRepository.findOne("target2")

            // then
            "target1" shouldBe (findTarget1.id)
            "target1" shouldBe (findTarget1.name)
            category.id shouldBe (findTarget1.category.id)

            "target2" shouldBe (findTarget2.id)
            "target2" shouldBe (findTarget2.name)
            category.id shouldBe (findTarget2.category.id)
        }
    }

    context("표적 즐겨찾기 테스트") {
        test("표적에 대해 즐겨찾기 추가, 해제 할 수 있다.") {
            // given
            val category = createCategory(categoryRepository)
            val target = createTargetRequestProto("target", "target", category.id)
            val isFavorite = true
            val request = createBookMarkRequestProto(target.id, isFavorite)
            targetService.createTarget(target)

            // when
            targetService.bookMark(request)
            val findTarget = targetRepository.findOne("target")

            // then
            isFavorite shouldBe findTarget.isFavorite
        }

        test("즐겨찾기를 위한 필수속성이 없을 경우 BadReqeustException이 발생한다.") {
            // given
            val isFavorite = true
            val request = createBookMarkRequestProto("", isFavorite)

            // when, then
            shouldThrow<BadRequestException> { targetService.bookMark(request) }
        }
        test("존재하지 않는 targetId를 입력 시 TargetNotFoundException이 발생한다.") {
            val isFavorite = true
            val request = createBookMarkRequestProto("test", isFavorite)

            // when, then
            shouldThrow<TargetNotFoundException> { targetService.bookMark(request) }
        }
    }

    context("표적 수정 테스트") {
        test("표적의 항목을 정상적으로 수정할 수 있다.") {
            // given
            val category = createCategory(categoryRepository)
            val target = createTargetRequestProto("target", "target", category.id)
            targetService.createTarget(target)
            val request = targetUpdateRequestProto("target", "target1", category.id!!)

            // when
            targetService.updateTarget(request)
            val findTarget = targetRepository.findOne("target")

            // then
            "target" shouldBe findTarget.id
            "target1" shouldBe findTarget.name
            category.id shouldBe findTarget.category.id
        }

        test("표적의 필수속성(currentId, name, categoryId)이 없을 경우 BadReqeusteException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)
            val request = targetUpdateRequestProto("target", "", category.id!!)

            // when, then
            shouldThrow<BadRequestException> { targetService.updateTarget(request) }
        }

        test("업데이트하고자 하는 타겟의 targetId가 존재하지 않는 경우 TargetNotFoundException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)
            val target = createTargetRequestProto("target", "target", category.id)
            targetService.createTarget(target)
            val request = targetUpdateRequestProto("target1", "target1", category.id!!)

            // when, then
            shouldThrow<TargetNotFoundException> { targetService.updateTarget(request) }
        }

        test("이미 존재하는 targetId로 변경하고자 하는 경우 IdDuplicationException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)
            val target = createTargetRequestProto("target", "target", category.id)
            targetService.createTarget(target)
            val request = targetUpdateRequestProto("target1", "target1", category.id!!, "target")

            // when, then
            shouldThrow<IdDuplicationException> { targetService.updateTarget(request) }
        }

        test("이미 존재하는 name으로 변경하고자 하는 경우 NameDuplicationException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)
            val target1 = createTargetRequestProto("target", "target", category.id)
            val target2 = createTargetRequestProto("target1", "target1", category.id)
            targetService.createTarget(target1)
            targetService.createTarget(target2)

            val request = targetUpdateRequestProto("target", "target1", category.id!!)

            // when, then
            shouldThrow<NameDuplicationException> { targetService.updateTarget(request) }
        }

        test("존재하지 않는 categoryId 입력 시 CategoryNotFoundException이 발생한다.") {
            // given
            val category = createCategory(categoryRepository)
            val target = createTargetRequestProto("target", "target", category.id)
            targetService.createTarget(target)

            val categoryId = randomUUID()
            val request = targetUpdateRequestProto("target", "target1", categoryId)

            // when, then
            shouldThrow<CategoryNotFoundException> { targetService.updateTarget(request) }
        }
    }

    context("표적 삭제 테스트") {
        test("표적을 정상적으로 삭제할 수 있다.") {
            // given
            val category = createCategory(categoryRepository)
            val target = createTargetRequestProto("target", "target", category.id)
            targetService.createTarget(target)
            val request = deleteTargetProto(target.id)

            // when, then
            should { targetService.deleteTarget(request) }
        }

        test("필수항목(targetId)이 없을 경우 BadReqeusetException이 발생한다.") {
            // given
            val targetId = ""
            val request = deleteTargetProto(targetId)

            // when, then
            shouldThrow<BadRequestException> { targetService.deleteTarget(request) }
        }

        test("존재하지 않는 targetId를 입력한 경우 TargetNotFoundException이 발생한다.") {
            // given
            val targetId = "target"
            val request = deleteTargetProto(targetId)

            // when, then
            shouldThrow<TargetNotFoundException> { targetService.deleteTarget(request) }
        }
    }

    context("표적 목록 삭제 테스트") {
        test("표적 목록을 정상적으로 삭제할 수 있다.") {
            // given
            val category = createCategory(categoryRepository)
            val target1 = createTargetRequestProto("target", "target", category.id)
            val target2 = createTargetRequestProto("target1", "target1", category.id)
            targetService.createTarget(target1)
            targetService.createTarget(target2)

            val deleteTarget1 = deleteTargetProto("target")
            val deleteTarget2 = deleteTargetProto("target1")

            val deleteTargetList = listOf(deleteTarget1, deleteTarget2)
            val request = deleteTargetListProto(deleteTargetList)

            // when, then
            should { targetService.deleteTargetList(request) }
        }
    }

    context("표적 필터 테스트") {
        test("표적 목록에서 필터링하여 원하는 표적을 조회할 수 있다.") {
            // given
            val category = createCategory(categoryRepository)
            val target1 = createTargetRequestProto("target1", "target1", category.id)
            val target2 = createTargetRequestProto("target2", "target2", category.id)
            targetService.createTarget(target1)
            targetService.createTarget(target2)
            val time = System.currentTimeMillis() / 1000
            println(time)
            val request = targetFilterProto(time, category.id)

            // when
            val targetList = targetService.targetFilter(request)

            // then
            "target1" shouldBe targetList.targetList[0].id
            "target1" shouldBe targetList.targetList[0].name
            category.id shouldBe targetList.targetList[0].category.id.toEntity()

            "target2" shouldBe targetList.targetList[1].id
            "target2" shouldBe targetList.targetList[1].name
            category.id shouldBe targetList.targetList[1].category.id.toEntity()

            2 shouldBe targetList.totalCount
        }
    }

    context("표적 검색 테스트") {
        test("표적 목록에서 검색하여 원하는 표적을 조회할 수 있다.") {
            // given
            val category = createCategory(categoryRepository)
            val target1 = createTargetRequestProto("target", "target", category.id)
            val target2 = createTargetRequestProto("target1", "target1", category.id)
            targetService.createTarget(target1)
            targetService.createTarget(target2)
            val request = targetSearchProto()

            // when
            val targetList = targetService.targetSearch(request)

            // then
            "target" shouldBe targetList.targetList[0].id
            "target" shouldBe targetList.targetList[0].name
            category.id shouldBe targetList.targetList[0].category.id.toEntity()

            "target1" shouldBe targetList.targetList[1].id
            "target1" shouldBe targetList.targetList[1].name
            category.id shouldBe targetList.targetList[1].category.id.toEntity()

            2 shouldBe targetList.totalCount
        }
    }
})

fun targetSearchProto() =
    TargetSearchRequestV1.newBuilder()
        .setIsFavorite(false)
        .setSearchProperty(
            TargetSearchProperty.newBuilder()
                .setId("target")
        )
        .setSortDirection(SortDirection.DEFAULT)
        .setTargetSortProperty(TargetSortProperty.DEFAULT)
        .setPaging(
            Paging.newBuilder()
                .setCount(10)
                .setPage(1)
        )
        .build()!!

fun targetFilterProto(time: Long, categoryId: UUID?) =
    TargetFilterRequestV1.newBuilder()
        .setSelectOption(TargetSelectOption.newBuilder().setIsFavorite(false).build())
        .setSortDirection(SortDirection.DEFAULT)
        .setTargetSortProperty(TargetSortProperty.DEFAULT)
        .setFilterProperty(
            FilterProperty.newBuilder()
                .addAllCategoryId(listOf(categoryId!!.toProto()))
                .setTimeRange(
                    TimestampRange.newBuilder()
                        .setEnd(
                            Timestamp.newBuilder().setSeconds(time)
                        )
                )
        )
        .build()!!

fun deleteTargetListProto(targetIdList: List<DeleteTargetRequestV1>) =
    DeleteTargetListRequestV1.newBuilder()
        .addAllId(targetIdList)
        .build()!!

fun deleteTargetProto(targetId: String) =
    DeleteTargetRequestV1.newBuilder()
        .setId(targetId)
        .build()!!

fun targetUpdateRequestProto(currentId: String, name: String, categoryId: UUID, newId: String? = null) =
    UpdateTargetRequestV1.newBuilder()
        .setCurrentId(currentId)
        .setNewId(newId ?: "")
        .setName(name)
        .setCategoryId(categoryId.toProto())
        .build()!!

fun createBookMarkRequestProto(targetId: String, isFavorite: Boolean) =
    TargetBookMarkRequestV1.newBuilder()
        .setTargetId(targetId)
        .setIsFavorite(isFavorite)
        .build()!!

fun createTargetListRequestProto(targetList: List<CreateTargetRequestV1>) =
    CreateTargetListRequestV1.newBuilder()
        .addAllTarget(targetList)
        .build()!!

private fun createTargetRequestProto(targetId: String?, targetName: String, categoryId: UUID?) =
    CreateTargetRequestV1.newBuilder()
        .setId(targetId ?: "")
        .setName(targetName)
        .setCategoryId(categoryId?.toProto())
        .build()

private fun createCategory(categoryRepository: CategoryRepository) =
    categoryRepository.save(Category(mainCategory = "메인", middleCategory = "미들", subCategory = "서브"))
