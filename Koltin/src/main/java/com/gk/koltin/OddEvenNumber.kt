package com.gk.koltin

fun main() {
    arrayOf(5,6,9,36).printEvenOddForEach()
}

private fun Array<Int>.printEvenOddForEach() {
    forEach { i ->
        if (i % 2 == 0)
            println("Even = $i")
        else
            println("Odd = $i")
    }
}