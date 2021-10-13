package com.sia.boot.app.test

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun buildDropdown() = createHTML().div(classes = "dropdown") {
    button(classes = "btn dropdown-toggle") {
        +"Dropdown"
        span(classes = "caret")
    }

    ul(classes = "dropdown-menu") {
        li { a("#") { +"Action" } }
        li { a("#") { +"Another action" } }
        li { role = "separator"; classes = setOf("divider") }
        li { classes = setOf("dropdown-header"); +"Header" }
        li { a("#") { +"Separated link" } }
    }
}

//fun dropdownExample() = createHTML().dropdown {
//    dropdownButton { +"Dropdown" }
//    dropdownMenu {
//        item("#", "Action")
//        item("#", "Another action")
//        divider()
//        dropdownHeader("Header")
//        item("#", "Separated link")
//    }
//}


fun main() {
    println(buildDropdown())
}