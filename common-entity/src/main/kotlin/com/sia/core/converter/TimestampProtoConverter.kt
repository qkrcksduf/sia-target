package com.sia.core.converter

import com.google.protobuf.util.Timestamps
import com.sia.common.TimestampRange
import com.google.protobuf.Timestamp as TimestampProto
import java.sql.Timestamp

fun Timestamp.toProto(): TimestampProto = Timestamps.fromMillis(this.time)

fun TimestampProto.toEntity(): Timestamp = Timestamp(Timestamps.toMillis(this))

fun ClosedRange<Timestamp>.toProto(): TimestampRange = TimestampRange.newBuilder()
    .setStart(start.toProto())
    .setEnd(endInclusive.toProto())
    .build()

fun TimestampRange.toEntity() = this.start.toEntity()..this.end.toEntity()
