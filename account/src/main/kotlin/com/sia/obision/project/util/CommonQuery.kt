package com.sia.obision.project.util

import com.sia.obision.project.param.target.FilterPropertyParam
import com.sia.obision.project.param.target.PagingParam
import org.hibernate.Session
import org.hibernate.type.IntegerType

@Suppress("NestedBlockDepth")
fun StringBuilder.filterQuery(filterProperty: FilterPropertyParam, entity: String) {
    append(
        " AND $entity.created_time >= '${filterProperty.startTime}' " +
                " AND $entity.created_time <= '${filterProperty.endTime}' "
    )

    if (filterProperty.categoryIdList?.isNotEmpty() == true) {
        val size = filterProperty.categoryIdList.size
        var count = 0
        if (filterProperty.categoryIdList.isNotEmpty()) {
            append(" AND c.id IN (")
            filterProperty.categoryIdList.forEach {
                count++
                if (count == size) {
                    append(" '$it'")
                } else {
                    append(" '$it',")
                }
            }
            append(")")
        }
    }
}

fun StringBuilder.pagingQuery(pagingParam: PagingParam) {
    if (pagingParam.offset != 0 && pagingParam.limit != 0) {
        append(" OFFSET ${pagingParam.offset - 1} LIMIT ${pagingParam.limit}")
    }
}

fun executeCountQuery(query: String, session: Session) =
    session.createNativeQuery(query)
        .addScalar("count", IntegerType())
        .resultList
        .firstOrNull()
        .toString()
        .toInt()