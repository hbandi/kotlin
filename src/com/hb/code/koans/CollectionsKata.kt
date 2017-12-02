package com.hb.code.koans

/**
 *
 * This part was inspired by GS Collections Kata.Default collections in Kotlin are Java collections,
 * but there are lots of useful extension functions for them. For example, operations that transform a collection to another one,
 * starting with 'to': toSet or toList.Implement an extension function Shop.getSetOfCustomers().
 */

class Customer(val name: String, val no: Int,val city:String)
class Shop(val shopName: String, val listOfVisitingCustomers: List<Customer>)

fun Shop.getVisitingCustomers(): Set<Customer> {
    return this.getVisitingCustomers().toSet()
}


