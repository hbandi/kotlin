package com.hb.code.koans

/**
 *
 * Kotlin supports a functional style of programming. Read about higher-order
  functions and function literals (lambdas) in Kotlin.

  Pass a lambda to any function to check if the collection contains an even number.
  The function any gets a predicate as an argument and returns true
  if there is at least one element satisfying the predicate.

 */
typealias even= (Int) ->Boolean

class EvenLamda {
    fun isListContainsEven(list: List<Int>): Boolean = list.any { it % 2 == 0 } }

fun main(args: Array<String>) {
    val lamda=EvenLamda()
    var result=lamda.isListContainsEven(listOf<Int>(21,11,13,9))
    println("Is list Contains even $result")
}