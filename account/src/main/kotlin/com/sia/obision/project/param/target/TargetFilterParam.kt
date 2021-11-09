package com.sia.obision.project.param.target

import com.sia.core.repository.infra.hibernate.querydsl.SortDirection

data class TargetFilterParam(
    val filterProperty: FilterPropertyParam,
    val sortDirection: SortDirection?,
    val isFavorite: Boolean,
    val targetSortProperty: TargetSortPropertyParam?,
    val paging: PagingParam
)
