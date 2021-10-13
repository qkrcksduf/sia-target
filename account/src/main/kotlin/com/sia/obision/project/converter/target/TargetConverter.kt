package com.sia.obision.project.converter.target

import com.google.protobuf.Timestamp
import com.google.protobuf.util.Timestamps
import com.sia.common.Paging
import com.sia.common.SortDirection
import com.sia.core.geometry.WGS84_SRID
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.param.target.*
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.target.v1.*
import org.locationtech.jts.geom.Coordinate
import org.locationtech.jts.geom.GeometryFactory
import org.locationtech.jts.geom.PrecisionModel
import java.lang.NumberFormatException

fun CreateTargetRequestV1.toParam() = CreateTargetParam(
  id = id,
  name = name,
  mgrs = mgrs,
  geography = geoPointToPoint(latitude, longitude),
  be = be,
  jdpi = jdpi,
  categoryId = categoryId.toEntity()
)

fun geoPointToPoint(latitude: String, longitude: String) =
  try {
    if (checkEmpty(latitude, longitude)) null else GeometryFactory(PrecisionModel(), WGS84_SRID).createPoint(
      Coordinate(latitude.toDouble(), longitude.toDouble()))
  } catch (e: NumberFormatException) {
    throw BadRequestException("latitude and longitude must be numbers")
  }

fun UpdateTargetRequestV1.toParam() = UpdateTargetParam(
  currentId = currentId,
  newId = newId,
  name = name,
  mgrs = mgrs,
  geography = geoPointToPoint(latitude, longitude),
  be = be,
  jdpi = jdpi,
  categoryId = categoryId.toEntity()
)

fun TargetSearchProperty.toParam() = TargetSearchPropertyParam(
  id = if (checkEmpty(id)) null else id,
  name = if (checkEmpty(name)) null else name,
  category = if (checkEmpty(category)) null else category
)

fun TargetFilterProperty.toParam() = TargetFilterPropertyParam(
  categoryIdList = categoryIdList.map { it.toEntity() },
  startTime = timeRange.start.toEntity(),
  endTime = timeRange.end.toEntity()
)

fun Paging.toParam() = PagingParam(
  offset = if (page == 0) 0 else count * (page - 1) + 1,
  limit = if (page == 0) 0 else count * page
)

fun TargetSortProperty.toParam(): TargetSortPropertyParam = when (this) {
  TargetSortProperty.TARGET_ID -> TargetSortPropertyParam.TARGET_ID
  TargetSortProperty.TARGET_NAME -> TargetSortPropertyParam.TARGET_NAME
  TargetSortProperty.CREATED_TIME -> TargetSortPropertyParam.CREATED_TIME
  else -> throw IllegalStateException()
}

fun TargetSortProperty.toEntity(): TargetSortPropertyParam? = when (this) {
  TargetSortProperty.DEFAULT -> null
  TargetSortProperty.TARGET_ID -> TargetSortPropertyParam.TARGET_ID
  TargetSortProperty.TARGET_NAME -> TargetSortPropertyParam.TARGET_NAME
  TargetSortProperty.CREATED_TIME -> TargetSortPropertyParam.CREATED_TIME
  else -> throw IllegalStateException()
}

fun Timestamp.toEntity(): java.sql.Timestamp = java.sql.Timestamp(Timestamps.toMillis(this))

fun SortDirection.toProto(): com.sia.core.repository.infra.hibernate.querydsl.SortDirection = when (this) {
  SortDirection.DEFAULT -> com.sia.core.repository.infra.hibernate.querydsl.SortDirection.ASC
  SortDirection.ASC -> com.sia.core.repository.infra.hibernate.querydsl.SortDirection.ASC
  SortDirection.DESC -> com.sia.core.repository.infra.hibernate.querydsl.SortDirection.DESC
  else -> throw IllegalStateException()
}

fun SortDirection.toEntity(): com.sia.core.repository.infra.hibernate.querydsl.SortDirection? = when (this) {
  SortDirection.DEFAULT -> null
  SortDirection.ASC -> com.sia.core.repository.infra.hibernate.querydsl.SortDirection.ASC
  SortDirection.DESC -> com.sia.core.repository.infra.hibernate.querydsl.SortDirection.DESC
  else -> throw IllegalStateException()
}