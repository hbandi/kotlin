package com.hb.code.koans

fun sort(){
    println(listOf("a","c","abc","bc","nn","ll").sorted())
    println(listOf("abc","abcvnnn","a","al","abcvc").sortedBy { it.length })
}

fun main(args: Array<String>) {
    sort()
}