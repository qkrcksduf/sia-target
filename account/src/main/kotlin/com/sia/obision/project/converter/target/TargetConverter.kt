package com.sia.obision.project.converter.target

import com.sia.common.GeoPoint
import com.sia.common.Paging
import com.sia.core.geometry.WGS84GeometryFactory
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.param.target.*
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.project.util.specialCharacterReplace
import com.sia.obision.target.v1.*
import com.sia.obision.target.v1.category.Category
import com.sia.obision.target.v1.target.*
import com.sia.obision.target.v1.target.Target

import java.lang.NumberFormatException

fun CreateTargetRequestV1.toParam() = CreateTargetParam(
    id = id.trim(),
    name = name.trim(),
    mgrs = mgrs.trim(),
    geography = geoPointToPoint(latitude, longitude),
    be = be.trim(),
    jdpi = jdpi.trim(),
    categoryId = categoryId.toEntity()
)

@SuppressWarnings("MagicNumber", "ComplexCondition")
fun geoPointToPoint(latitude: String, longitude: String) =
    try {
        if (checkEmpty(latitude, longitude)) null else {
            val doubleLatitude = latitude.trim().toDouble()
            val doubleLongitude = longitude.trim().toDouble()
            if ((doubleLatitude > 90 || doubleLatitude < -90) || (doubleLongitude > 180 || doubleLongitude < -180)) {
                throw BadRequestException("out of range of latitude and longitude")
            }

            WGS84GeometryFactory.createPoint(doubleLatitude, doubleLongitude)
        }
    } catch (e: NumberFormatException) {
        throw BadRequestException("latitude and longitude must be numbers")
    }

fun UpdateTargetRequestV1.toParam() = UpdateTargetParam(
    currentId = currentId.trim(),
    newId = if (newId.isEmpty()) null else newId.trim(),
    name = name.trim(),
    mgrs = mgrs.trim(),
    geography = geoPointToPoint(latitude, longitude),
    be = be.trim(),
    jdpi = jdpi.trim(),
    categoryId = categoryId.toEntity()
)

fun TargetSearchProperty.toParam() = TargetSearchPropertyParam(
    id = if (checkEmpty(id)) null else specialCharacterReplace(id.trim()),
    name = if (checkEmpty(name)) null else specialCharacterReplace(name.trim()),
    category = if (checkEmpty(category)) null else category
)

fun FilterProperty.toParam() = FilterPropertyParam(
    categoryIdList = categoryIdList.map { it.toEntity() },
    startTime = timeRange.start.toEntity(),
    endTime = timeRange.end.toEntity()
)

fun Paging.toParam() = PagingParam(
    offset = if (page == 0) 0 else count * (page - 1) + 1,
    limit = if (page == 0) 0 else count
)

fun com.sia.obision.project.repo.target.view.TargetView.toProto() = Target.newBuilder()
    .setId(targetId)
    .setName(name)
    .setCategory(
        Category.newBuilder()
            .setId(categoryId.toProto())
            .setMainCategory(mainCategory)
            .setMiddleCategory(middleCategory ?: "")
            .setSubCategory(subCategory ?: "")
    )
    .setMgrs(mgrs ?: "")
    .setGeography(geography?.toGeoPoint() ?: GeoPoint.getDefaultInstance())
    .setBe(be ?: "")
    .setJdpi(jdpi ?: "")
    .setCreatedTime(createdTime.toProto())
    .setIsFavorite(isFavorite)
    .build()!!

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
    else -> throw BadRequestException("DEFAULT, TARGET_ID, TARGET_NAME, CREATED_TIME 중 하나를 반드시 입력해야 합니다.")
}

fun com.sia.common.SortDirection.toEntity(): com.sia.core.repository.infra.hibernate.querydsl.SortDirection? =
    when (this) {
        com.sia.common.SortDirection.DEFAULT -> null
        com.sia.common.SortDirection.ASC -> com.sia.core.repository.infra.hibernate.querydsl.SortDirection.ASC
        com.sia.common.SortDirection.DESC -> com.sia.core.repository.infra.hibernate.querydsl.SortDirection.DESC
        else -> throw BadRequestException("DEFAULT, ASC, DESC 중 하나를 반드시 입력해야 합니다.")
    }
