package com.sia.obision.project.repo.target.view

import org.locationtech.jts.geom.Point
import java.sql.Timestamp
import java.util.*

data class TargetView(
    val targetId: String,
    val name: String,
    val categoryId: UUID,
    val mainCategory: String,
    val middleCategory: String?,
    val subCategory: String?,
    val mgrs: String?,
    val geography: Point?,
    val be: String?,
    val jdpi: String?,
    val createdTime: Timestamp,
    val isFavorite: Boolean
)
