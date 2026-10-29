package com.gk.koltin

fun main() {
    println(findMissingChar("abcdefghijklmnopqrstuvwxyz", "ubduvvhjvcjvjv"))
}

// Time complexity: O(n) & Space complexity: O(1)
fun findMissingChar(fullStr: String, partStr: String): Char? {
    for (char in fullStr) {
        if (char !in partStr) {
            return char
        }
    }
    return null
}