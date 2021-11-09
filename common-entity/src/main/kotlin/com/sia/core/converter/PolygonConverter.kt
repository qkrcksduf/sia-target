package com.sia.core.converter

import com.google.protobuf.ByteString
import com.sia.core.geometry.WGS84_SRID
import com.sia.common.Polygon as PolygonProto
import com.sia.common.MultiPolygon as MultiPolygonProto
import org.locationtech.jts.geom.Coordinate
import org.locationtech.jts.geom.GeometryFactory
import org.locationtech.jts.geom.MultiPolygon
import org.locationtech.jts.geom.Polygon
import org.locationtech.jts.geom.PrecisionModel
import org.locationtech.jts.io.WKBReader
import org.locationtech.jts.io.WKBWriter

fun Polygon.toProto(wkb: Boolean = false): PolygonProto =
    PolygonProto.newBuilder().also {
        if (wkb)
            it.wkb = ByteString.copyFrom(WKBWriter().write(this))
        else
            it.addAllPoint(this.coordinates.map { it.toProto() })
    }.build()

fun MultiPolygonProto.toEntity(): MultiPolygon {
    val factory = GeometryFactory(PrecisionModel(), WGS84_SRID)
    return if (this.wkb.isEmpty) {
        val polygonArray = this.polygonList.map { it.toEntity() }.toTypedArray()
        factory.createMultiPolygon(polygonArray)
    } else {
        val geom = WKBReader(factory).read(wkb.toByteArray())
        geom as? MultiPolygon ?: (geom as Polygon).let {
            factory.createMultiPolygon(arrayOf(it))
        }
    }
}

fun PolygonProto.toEntity(): Polygon {
    val factory = GeometryFactory(PrecisionModel(), WGS84_SRID)
    return if (this.wkb.isEmpty) {
        val coordinateArray = this.pointList.map { Coordinate(it.x, it.y) }.toTypedArray()
        factory.createPolygon(coordinateArray)
    } else {
        (WKBReader(factory).read(wkb.toByteArray()) as Polygon).also {
            it.srid = WGS84_SRID
        }
    }
}
