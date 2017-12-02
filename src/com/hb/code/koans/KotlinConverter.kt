package com.hb.code.koans

/**
 * Convert collection to a string in a json format
 */
class KotlinConverter {

    fun toJSON(collection: Collection<Int>): String? {
        val result = StringBuilder();
        result.append("[")
        val iterator = collection.iterator();
        while (iterator != null && iterator.hasNext()) {
            val str = iterator.next();
            result.append(str)
            if (iterator.hasNext()) {
                result.append(",")
            }
        }
        result.append("]")
        return result.toString();
    }

}

fun main(args: Array<String>) {

    var kc = KotlinConverter();
    val numbers = mutableListOf<Int>(1, 2, 3, 4)
    val str: String? = kc.toJSON(numbers)
    println("converted JSON is $str")

}