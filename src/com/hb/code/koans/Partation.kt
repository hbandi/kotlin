package com.hb.code.koans

fun partation(){
    val numbers= listOf<Int>(-1,3,-4,2,-10,19,-89,102,-65)
    val (positive,negative) =numbers.partition { it>100 }
    println("positive :: "+positive)
    println("negative :: "+negative)
}

fun main(args: Array<String>) {
    partation()
}