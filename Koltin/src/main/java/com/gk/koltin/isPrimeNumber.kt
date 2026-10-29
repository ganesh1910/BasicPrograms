package com.gk.koltin

private fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for(i in 2 until num){
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    println("Is Prime ${isPrime(11)}")
    println("Is Prime ${isPrime(12)}")
    println("Is Prime ${isPrime(9)}")
}