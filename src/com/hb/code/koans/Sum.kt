package com.hb.code.koans

fun sum():Int{
    return listOf<Int>(1,10,20,30).sum()
}
fun sumByLength():Int{
    return listOf<String>("abc","a","ab","ac").sumBy { it.length }
}

fun main(args: Array<String>) {
    println(sum())
    println(sumByLength())
}