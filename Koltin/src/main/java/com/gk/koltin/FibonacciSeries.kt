package com.gk.koltin

fun main() {

    var n1=0
    var n2=1
    /*for (i in 0..50){
        when(i){
            0 -> print("$i ")
            1 -> print("$i ")
            else -> {
                val n3 = n1 + n2
                n1=n2
                n2=n3
                print("$n3 ")
            }
        }
    }*/

    println(" Advanced")
    var x = 0
    var y = 1
    repeat(5) {
        println("$x ")
        y = (y+x).also { x = y }
    }

    val result = generateFibonacci(10)
    println(result)  // Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
}

fun generateFibonacci(n: Int): List<Int> {
    val fibonacci = mutableListOf(0, 1)
    for (i in 2 until n) {
        fibonacci.add(fibonacci[i - 1] + fibonacci[i - 2])
    }
    return fibonacci
}