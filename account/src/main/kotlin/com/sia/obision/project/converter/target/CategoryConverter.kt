package com.sia.obision.project.converter.target

import com.sia.obision.project.entity.target.Category
import com.sia.obision.project.param.target.CreateCategoryParam
import com.sia.obision.project.param.target.UpdateCategoryParam
import com.sia.obision.target.v1.category.CreateCategoryRequestV1
import com.sia.obision.target.v1.category.UpdateCategoryRequestV1

fun CreateCategoryRequestV1.toParam() = CreateCategoryParam(
    mainCategory = mainCategory,
    middleCategory = middleCategory.ifEmpty { null },
    subCategory = subCategory.ifEmpty { null }
)

fun UpdateCategoryRequestV1.toParma() = UpdateCategoryParam(
    id = id.toEntity(),
    mainCategory = mainCategory,
    middleCategory = middleCategory.ifEmpty { null },
    subCategory = subCategory.ifEmpty { null }
)

fun Category.toProto(): com.sia.obision.target.v1.category.Category =
    com.sia.obision.target.v1.category.Category.newBuilder()
        .setId(id!!.toProto())
        .setMainCategory(mainCategory)
        .setMiddleCategory(middleCategory ?: "")
        .setSubCategory(subCategory ?: "")
        .build()
