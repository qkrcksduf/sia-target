package com.sia.common.converter

import com.sia.common.TimeZone
import java.util.*

fun TimeZone.toEntity(): java.util.TimeZone =
    if (zoneId.isNotBlank()) java.util.TimeZone.getTimeZone(zoneId) else java.util.TimeZone.getDefault()
