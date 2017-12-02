package com.hb.code.koans

fun sumUsingFold():Int{
    return listOf<Int>(10,19,18,1,2,5).fold(0,{sum,next->sum+next})
}

fun main(args: Array<String>) {
    println(sumUsingFold())
}