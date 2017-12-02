package com.hb.code.koans

import java.util.*

/**
 * SAM conversions

    When an object implements a SAM interface (one with a Single Abstract Method),
    you can pass a lambda instead. Read more about SAM conversions in the blog posts
    about Kotlin. At first, SAM-constructors were introduced, then SAM-conversions
    were finally supported.

    In the previous example change an object expression to a lambda
 */

fun samConversion():List<Int>{
    val list:List<Int> = listOf(6,1,900,87)
    Collections.sort(list,{x,y -> x-y})
    return list
}

fun main(args: Array<String>) {
    println("sam conversion :: "+ samConversion())
}