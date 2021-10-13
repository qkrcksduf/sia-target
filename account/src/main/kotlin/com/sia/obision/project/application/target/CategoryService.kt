package com.sia.obision.project.application.target

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toParam
import com.sia.obision.project.converter.target.toParma
import com.sia.obision.project.converter.target.toProto
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.repo.target.CategoryRepository
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.target.v1.*

object CategoryService {

  fun createCategory(request: CreateCategoryRequestV1): CreateCategoryResponseV1 {
    val categoryParam = request.toParam()
    if (checkEmpty(request.mainCategory)) throw BadRequestException("mainCategory must exist")
    val categoryRepository = injector().get<CategoryRepository>()
    val category = com.sia.obision.project.entity.target.Category(
      mainCategory = categoryParam.mainCategory,
      middleCategory = categoryParam.middleCategory,
      subCategory = categoryParam.subCategory)
    categoryRepository.use {
      it.save(category)
    }
    return CreateCategoryResponseV1.newBuilder()
      .setId(category.id!!.toProto())
      .build()
  }

  fun createCategoryList(request: CreateCategoryListRequestV1): CreateCategoryListResponseV1 {
    return CreateCategoryListResponseV1.newBuilder()
      .addAllCategory(request.categoryList.map(::createCategory))
      .build()
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
    val id = request.id.toEntity()
    if (checkEmpty(id.toString())) throw BadRequestException("id must exist")
    val categoryRepository = injector().get<CategoryRepository>()
    categoryRepository.use {
      it.delete(id)
    }
  }

  fun deleteCategoryList(request: DeleteCategoryListRequestV1) {
    request.categoryList.forEach(::deleteCategory)
  }

  fun updateCategory(request: UpdateCategoryRequestV1) {
    val categoryParam = request.toParma()
    if (checkEmpty(
        request.id.toString(),
        request.mainCategory)
    ) throw BadRequestException("id, mainCategory must exist")
    val categoryRepository = injector().get<CategoryRepository>()
    categoryRepository.use {
      val category = it.findOne(categoryParam.id)
      category.update(
        mainCategory = categoryParam.mainCategory,
        middleCategory = categoryParam.middleCategory,
        subCategory = categoryParam.subCategory)
      it.save(category)
    }
  }


}
