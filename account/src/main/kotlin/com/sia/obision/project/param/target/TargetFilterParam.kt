package com.sia.obision.project.param.target

import com.sia.core.repository.infra.hibernate.querydsl.SortDirection
import java.sql.Timestamp
import java.util.*

data class TargetFilterParam(
  val filterProperty: TargetFilterPropertyParam,
  val sortDirection: SortDirection,
  val targetSortProperty: TargetSortPropertyParam,
  val paging: PagingParam
)

data class TargetFilterPropertyParam(
  val categoryIdList: List<UUID>,
  val startTime: Timestamp,
  val endTime: Timestamp
)

