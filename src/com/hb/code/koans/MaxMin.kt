package com.hb.code.koans

fun getMaxNumberInAList(){
    println(listOf(15,190,981,9000).max())
    println(listOf("a","abc","abcd").minBy { it.length })
}

fun main(args: Array<String>) {
    getMaxNumberInAList()
}
