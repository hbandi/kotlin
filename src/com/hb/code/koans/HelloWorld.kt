package com.hb.code.koans

/**
 * Print OK using with a simple function
 */
class HelloWorld {
    fun start() = "OK"
}


fun main(args: Array<String>) {
    var hw = HelloWorld()
    println(" " + hw.start())
}