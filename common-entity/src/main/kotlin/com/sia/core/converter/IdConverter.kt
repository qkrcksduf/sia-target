package com.sia.core.converter

import com.sia.boot.account.LongId
import com.sia.boot.account.StringId

fun Long.toIdProto(): LongId = LongId.newBuilder().setId(this).build()

fun String.toIdProto(): StringId = StringId.newBuilder().setId(this).build()
