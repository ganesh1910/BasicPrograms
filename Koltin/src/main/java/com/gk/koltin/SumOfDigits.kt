package com.gk.koltin

private fun sumOfDigits(number: Int): Int {
    return number.toString().map { it.toString().toInt() }.sum()
}

private fun sumOfDigits2(number: Int): Int {
    var sum = 0
    var num = number
    while (num != 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}

fun main() {
    println("Sum of digits ${sumOfDigits(12345)}")
    println("Sum of digits ${sumOfDigits2(12345)}")
}
