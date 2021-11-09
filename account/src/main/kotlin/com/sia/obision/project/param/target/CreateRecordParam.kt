package com.sia.obision.project.param.target

data class CreateRecordParam(
    val targetName: String,
    val contents: String,
    val creator: String,
    val isEmergency: Boolean
)
