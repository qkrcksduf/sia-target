package com.sia.obision.project.param.target

import java.util.*

data class UpdateCategoryParam(
    val id: UUID,
    val mainCategory: String,
    val middleCategory: String?,
    val subCategory: String?
)
