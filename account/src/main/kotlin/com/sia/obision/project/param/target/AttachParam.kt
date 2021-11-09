package com.sia.obision.project.param.target

import java.util.*

data class AttachParam(
    val id: UUID,
    val fileName: String,
    val fileExtension: String,
    val size: Int,
)
