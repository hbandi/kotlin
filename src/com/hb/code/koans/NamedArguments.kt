package com.hb.code.koans

/**
 * Named arguments
 * Default and named arguments help to minimize the number of overloads
   and improve the readability of the function invocation.
   The library function joinToString is declared with default values for parameters:

    fun joinToString(
            separator: String = ", ",
            prefix: String = "",
            postfix: String = "",
            /* ... */
            ): String

    It can be called on a collection of Strings. Using named arguments
    make the function joinOptions() return the list in a JSON format (e.g., "[a, b, c]")
 */


class NamedArguments {

    fun joinToString(separator: String = ",",
                     preFix: String = "[",
                     postFix: String = "]",
                     value: String = "abc"): String {

        val str = StringBuilder()
        str.append(preFix)
        for (i in value.indices) {
            str.append(value[i])
            if (i < value.length - 1) {
                str.append(separator)
            }
        }
        str.append(postFix)

        return str.toString()
    }
}

fun main(args: Array<String>) {
    val namedArguments = NamedArguments()
    val str = namedArguments.joinToString()
    println("Joined String= " + str)
}