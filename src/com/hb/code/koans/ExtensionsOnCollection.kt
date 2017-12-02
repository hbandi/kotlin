package com.hb.code.koans

import java.util.*

/**
 *  Extension functions on collections

    Kotlin code can be easily mixed with Java code. Thus in Kotlin we don't
    introduce our own collections, but use standard Java ones (slightly improved).
    Read about read-only and mutable views on Java collections.

    In Kotlin standard library there are lots of extension functions that make
    the work with collections more convenient. Rewrite the previous example once
    more using an extension function sortedDescending.
 */
fun ArrayList<Int>.sortDesc(){
    Collections.sort(this,{x,y->y-x})
}

fun getDescList():List<Int>{
    val list:ArrayList<Int> = arrayListOf(19,2,45,7,88,1990)
    list.sortDesc()
    return list
}

fun main(args: Array<String>) {
    println(getDescList())
}