package com.sia.core.converter

import com.sia.common.GeoPoint
import com.sia.common.PixelPoint
import com.sia.core.geometry.Point2D
import com.sia.core.geometry.WGS84_SRID
import org.locationtech.jts.geom.Coordinate
import org.locationtech.jts.geom.GeometryFactory
import org.locationtech.jts.geom.Point
import org.locationtech.jts.geom.PrecisionModel
import com.sia.common.Point as PointProto

fun Coordinate.toProto(): PointProto =
    PointProto.newBuilder()
        .setX(x)
        .setY(y)
        .build()

fun Point2D<Double>.toProto(): PointProto =
    PointProto.newBuilder()
        .setX(x)
        .setY(y)
        .build()

fun Point.toProto(): PointProto =
    PointProto.newBuilder()
        .setX(x)
        .setY(y)
        .build()

fun Point.toGeoPoint(): GeoPoint = GeoPoint.newBuilder().setLatitude(y).setLongitude(x).build()

fun PointProto.toPoint(): Point =
    GeometryFactory(PrecisionModel(), WGS84_SRID).createPoint(Coordinate(x, y))

fun PointProto.toDoublePoint(): Point2D<Double> =
    Point2D(
        x = x,
        y = y
    )

fun PointProto.toIntPoint(): Point2D<Int> =
    Point2D(
        x = x.toInt(),
        y = y.toInt()
    )

fun PixelPoint.toIntPoint(): Point2D<Int> = Point2D(x = x, y = y)
