package com.hb.code.koans

/**
 * Smart casts
Rewrite the following Java code using smart casts and when expression:

public int eval(Expr expr) {
if (expr instanceof Num) {
return ((Num) expr).getValue();
}
if (expr instanceof Sum) {
Sum sum = (Sum) expr;
return eval(sum.getLeft()) + eval(sum.getRight());
}
throw new IllegalArgumentException("Unknown expression");
}

 */
interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Int, val right: Int) : Expr

class SmartCasts {

    fun eval(expr: Expr) {
        when (expr) {
            is Num -> expr.value
            is Sum -> expr.left + expr.right
            else -> throw IllegalArgumentException("Error Type passed")
        }
    }

}