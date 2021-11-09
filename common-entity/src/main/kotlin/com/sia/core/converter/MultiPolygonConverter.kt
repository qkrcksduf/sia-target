package com.sia.core.converter

import com.google.protobuf.ByteString
import com.sia.common.MultiPolygon as MultiPolygonProto
import com.sia.common.Polygon as PolygonProto
import org.locationtech.jts.geom.MultiPolygon
import org.locationtech.jts.io.WKBWriter

fun MultiPolygon.toProto(wkb: Boolean = false): MultiPolygonProto {
    return MultiPolygonProto.newBuilder().also {
        if (wkb) {
            it.wkb = ByteString.copyFrom(WKBWriter().write(this))
        } else {
            val polygonList = mutableListOf<PolygonProto>()
            for (i in 0 until this.numGeometries) {
                val pointList = this.getGeometryN(i).coordinates.map { it.toProto() }
                val polygon = PolygonProto.newBuilder().addAllPoint(pointList).build()
                polygonList.add(polygon)
            }

            it.addAllPolygon(polygonList).build()
        }
    }.build()
}
