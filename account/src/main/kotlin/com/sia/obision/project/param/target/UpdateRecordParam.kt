package com.sia.obision.project.param.target

import java.util.*

data class UpdateRecordParam(
    val id: UUID,
    val targetName: String,
    val contents: String,
    val isEmergency: Boolean
)
