package com.sia.obision.project.param.target

import com.sia.core.repository.infra.hibernate.querydsl.SortDirection

data class TargetSearchParam(
    val searchProperty: TargetSearchPropertyParam,
    val sortDirection: SortDirection?,
    val isFavorite: Boolean,
    val targetSortProperty: TargetSortPropertyParam?,
    val paging: PagingParam
)

data class TargetSearchPropertyParam(
    val id: String?,
    val name: String?,
    val category: String?
)
