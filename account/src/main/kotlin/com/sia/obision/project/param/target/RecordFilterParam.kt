package com.sia.obision.project.param.target

import com.sia.core.repository.infra.hibernate.querydsl.SortDirection

data class RecordFilterParam(
    val filterProperty: FilterPropertyParam,
    val selectOption: RecordSelectOptionParam,
    val sortDirection: SortDirection?,
    val recordSortProperty: RecordSortPropertyParam?,
    val paging: PagingParam
)
