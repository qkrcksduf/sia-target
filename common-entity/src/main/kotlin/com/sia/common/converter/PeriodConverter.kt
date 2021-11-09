package com.sia.common.converter

import com.sia.common.Period
import com.sia.core.converter.toEntity

fun Period.toTimestampRange() = this.start.toEntity()..this.end.toEntity()
