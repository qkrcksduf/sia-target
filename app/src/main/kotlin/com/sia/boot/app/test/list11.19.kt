package com.sia.boot.app.test


fun main() {
    val s = "kot test"

    s should startWith("kot")
}

infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)

interface Matcher<T> {
    fun test(value: T)
}

class startWith(val prefix: String) : Matcher<String> {
    override fun test(value: String) {
        if (value.startsWith(prefix))
            println("hit")
        if (!value.startsWith(prefix))
            throw AssertionError("String $value does not start with $prefix")
    }
}