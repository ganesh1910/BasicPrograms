package com.gk.koltin

// Time complexity O(n) - Space complexity O(n)
private fun String.reversSentence(): String {
    return this.split(" ").reversed().joinToString(" ")
}

// Time complexity O(n) - Space complexity O(n)
private fun reverseSentence(sentence: String): String {
    val listString = sentence.split(" ")
    var reverseSentence = ""
    for (i in (listString.size-1) downTo 0) {
           reverseSentence += listString[i] + " "
    }
    return reverseSentence
}


fun main() {
    val sentence = "Hi I'm Ganesh Khandagale"
    println("With Built-In reverse fun = ${sentence.reversSentence()}")
    println("Without reverse = ${reverseSentence(sentence = sentence)}")
}