package com.sia.common.converter

import com.sia.common.DoubleRange
import com.sia.common.IntRange

fun IntRange.toIntRange() = this.start..this.end
fun DoubleRange.toDoubleRange() = this.start..this.end
