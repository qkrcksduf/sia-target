package com.sia.core.ex

data class Paging(
    val limit: Int = 0,
    val skip: Int = 0,
    val isValid: Boolean = true
)
