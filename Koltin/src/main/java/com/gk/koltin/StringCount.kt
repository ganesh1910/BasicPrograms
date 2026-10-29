package com.gk.koltin

fun main() {
    println(countCharacters("Hello World"))
    println(countCharacter2("Hello World"))
}

fun countCharacters(input: String): Map<Char, Int> {
    return input.groupingBy { it }.eachCount()
}

// Time complexity O(n) - Space complexity O(n)
fun countCharacter2(input: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    input.forEach { char ->
        map[char] = map.getOrDefault(char, 0) + 1
    }
    return map
}