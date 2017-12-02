package com.hb.code.koans

/**
 * Implement extension functions Shop.getCitiesCustomersAreFrom() and Shop.getCustomersFrom() using functions map and filter.
 **/
class City(val name: String)

fun getAllCustomers(): Set<Customer> {
    return setOf(Customer("hanumanth", 10, "HYD"),
            Customer("Sai", 20, "BLR"),
            Customer("Ramu", 30, "HYD"))
}

fun Shop.getCitiesCustomersAreFrom(): Set<String> = getAllCustomers().map { it.city }.toSet()
fun Shop.getCustomersFrom(city: String): Set<Customer> = getAllCustomers().filter { it.city == city }.toSet()

/**
 * Implement all the functions below using all, any, count, firstOrNull.
    val numbers = listOf(-1, 0, 2)
    val isZero: (Int) -> Boolean = { it == 0 }
    numbers.any(isZero) == true
    numbers.all(isZero) == false
    numbers.count(isZero) == 1
    numbers.firstOrNull { it > 0 } == 2
 **/
fun Shop.checkAllCustomersAreFrom(city: String): Boolean = getAllCustomers().all { it.city == city }

fun Shop.hasCustomerFrom(city: String): Boolean = getAllCustomers().any({ it.city == city })
fun Shop.countCustomersFrom(city: String): Int = getAllCustomers().count({ it.city == city })
fun Shop.finAnyCustomerFrom(city: String): Customer? = getAllCustomers().firstOrNull({ it.city == city })


