package com.sia.core.ex

import com.sia.common.Paging as PagingProto

fun PagingProto.isValid(): Boolean = if (this.page < 1) false else this.count != 0

fun PagingProto.getLimit(): Int = count
fun PagingProto.getSkip(): Int = (page - 1) * count
fun PagingProto.toPaging(): Paging = Paging(
    limit = getLimit(),
    skip = getSkip(),
    isValid = isValid()
)
