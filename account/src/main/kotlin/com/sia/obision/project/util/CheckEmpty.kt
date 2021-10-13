package com.sia.obision.project.util

fun checkEmpty(vararg values: String): Boolean {
    for (value in values) {
        if (value.isEmpty()) {
            return true
        }
    }
    return false
}
