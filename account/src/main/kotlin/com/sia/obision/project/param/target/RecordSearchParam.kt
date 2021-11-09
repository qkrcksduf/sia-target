package com.sia.obision.project.param.target

import com.sia.core.repository.infra.hibernate.querydsl.SortDirection

data class RecordSearchParam(
    val searchProperty: RecordSearchPropertyParam,
    val selectOption: RecordSelectOptionParam,
    val sortDirection: SortDirection?,
    val recordSortProperty: RecordSortPropertyParam?,
    val paging: PagingParam
)

data class RecordSearchPropertyParam(
    val targetName: String?,
    val creator: String?,
    val contents: String?
)
