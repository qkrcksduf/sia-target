package com.sia.obision.project.param.target

import java.util.*

data class UploadAttachParam(
    val recordId: UUID,
    val fileName: String,
    val fileExtension: String,
    val size: Int,
)
