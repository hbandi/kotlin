package com.hb.code.koans

/**
 * Read about extension functions. Then implement extension functions Int.r()
and Pair.r() and make them convert Int and Pair to RationalNumber.
 */

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

data class RationalNumber(val numerator: Int, val denumarator: Int)

fun Int.r(): RationalNumber {
    return RationalNumber(this, 1)
}

fun Pair<Int, Int>.r(): RationalNumber {
    return RationalNumber(this.first, this.second)
}

fun Pair<Int, Int>.p(): RationalNumber {
    return RationalNumber(this.component1(), this.component2())
}

