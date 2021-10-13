package com.sia.boot.app

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun createSimpleTable() = createHTML().
        table {
            tr {
                td {+"cell"}
            }
        }

fun main() {
    println(createSimpleTable())
}