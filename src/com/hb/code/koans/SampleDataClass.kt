package com.hb.code.koans

/**
 * data class example
 */
data class Person(val name: String, val no: Int);

fun getPeople(): List<Person> {
    return listOf(Person("Raj", 22), Person("hanumanth", 33))
}

fun main(args: Array<String>) {
    val people: List<Person> = getPeople()
    val bool = people.contains(Person("satish", 33))
    println(" bool is :: " + bool)
}