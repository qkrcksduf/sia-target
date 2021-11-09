package com.sia.core.converter

import com.sia.core.repository.infra.hibernate.querydsl.SortDirection
import com.sia.common.SortDirection as SortDirectionProto

fun SortDirectionProto.toEntity(): SortDirection? = when (this) {
    SortDirectionProto.DEFAULT -> null
    SortDirectionProto.ASC -> SortDirection.ASC
    SortDirectionProto.DESC -> SortDirection.DESC
    else -> throw IllegalStateException()
}

fun SortDirectionProto.toProto(): SortDirection = when (this) {
    SortDirectionProto.DEFAULT -> SortDirection.ASC
    SortDirectionProto.ASC -> SortDirection.ASC
    SortDirectionProto.DESC -> SortDirection.DESC
    else -> throw IllegalStateException()
}
