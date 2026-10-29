package com.gk.koltin

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * (factorial(n-1))
}

fun factorial2(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    val result = factorial(5)
    val result2 = factorial2(5)
    println("Factorial of 5 is $result")
    println("Factorial of 5 is $result2")
}