package com.gk.koltin

fun main() {
    println("welcome".removeUsingDrop())
}

fun String.removeUsingDrop() {
    println(this.drop(0).dropLast(this.length - 1))
}