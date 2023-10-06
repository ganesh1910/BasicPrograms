package com.gk.koltin

fun main() {
    "Hello World".removeUsingSubString()
    "Hello World".removeUsingDrop()
    "Hello World".removeUsingFor()
    "Hello World".removeUsingForEach()
}

private fun String.removeUsingSubString() {
    println(this.substring(1, this.length - 1))
}

private fun String.removeUsingDrop() {
    println(this.drop(1).dropLast(1))
}

private fun String.removeUsingFor() {
    var temp = ""
    for (i in indices) {
        if (i != 0 && i != this.length - 1) {
            temp += this[i]
        }
    }
    println(temp)
}

private fun String.removeUsingForEach() {
    var temp = ""
    forEachIndexed { i, char ->
        if (i != 0 && i != length - 1) {
            temp += char
        }
    }
    println(temp)
}