package com.sia.obision.project.param.target

import org.locationtech.jts.geom.Point
import java.util.*

data class CreateTargetParam(
    val id: String,
    val name: String,
    val mgrs: String? = null,
    val geography: Point? = null,
    val be: String? = null,
    val jdpi: String? = null,
    val categoryId: UUID
)
