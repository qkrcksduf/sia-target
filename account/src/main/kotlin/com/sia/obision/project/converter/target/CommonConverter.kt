package com.sia.obision.project.converter.target

import com.google.protobuf.util.Timestamps
import com.sia.common.GeoPoint
import org.locationtech.jts.geom.Point
import java.sql.Timestamp
import java.util.*

fun UUID.toProto(): com.sia.common.UUID = com.sia.common.UUID.newBuilder().setValue(toString()).build()

fun com.sia.common.UUID.toEntity(): UUID = UUID.fromString(value)

fun Timestamp.toProto(): com.google.protobuf.Timestamp = Timestamps.fromMillis(this.time)

fun Point.toGeoPoint(): GeoPoint = GeoPoint.newBuilder().setLatitude(y).setLongitude(x).build()

fun com.google.protobuf.Timestamp.toEntity(): Timestamp = Timestamp(Timestamps.toMillis(this))
