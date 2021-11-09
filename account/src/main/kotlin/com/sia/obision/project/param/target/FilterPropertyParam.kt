package com.sia.obision.project.param.target

import java.sql.Timestamp
import java.util.*

data class FilterPropertyParam(
    val categoryIdList: List<UUID>?,
    val startTime: Timestamp,
    val endTime: Timestamp
)
