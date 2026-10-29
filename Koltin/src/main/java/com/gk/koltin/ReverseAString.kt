package com.gk.koltin

/*fun String.reverseString(): String {
    return this.reversed()
}*/

// Time complexity O(n) - Space complexity O(1)
fun reverseString(input: String): String {
    var reverse = ""
    val count = input.length - 1
    for (i in count downTo 0) {
        reverse += input[i]
    }
    return reverse
}

fun main() {
    val input = "Hello"
//    println(input.reverseString())
    println(reverseString(input))
}