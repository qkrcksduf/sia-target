package com.sia.obision.project

import java.io.File

fun main() {
//    val path = "/Users/chanyeol/workspace/development/study/tutorial/armeria-coding-test/kotlin.txt"
//
//    val file = File(path)
//    val inputStream = file.inputStream()
//    val text1 = inputStream.bufferedReader().use { it.readText() }
//    println(text1)
//
//    val path1 = "/Users/chanyeol/workspace/development/study/tutorial/armeria-coding-test/kotlin1.txt"
//
//    File(path1).bufferedWriter().use {it.write(text1)}
    var data = "%_'"
    data = selectSpecialCharacterCheck(data)
    println(data)
}

fun selectSpecialCharacterCheck(value: String) =
    value.replace(Regex("'"), "'")
        .replace(Regex("_"), """\\_""")
        .replace(Regex("%"), """\\%""")
