package com.sia.core.ex

import com.sia.common.Period
import com.sia.core.converter.toEntity
import java.sql.Timestamp

fun Timestamp.isBetween(period: Period) = this.after(period.start.toEntity()) && this.before(period.end.toEntity())
