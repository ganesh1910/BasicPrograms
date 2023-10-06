package com.gk.koltin

fun main() {
    println("${656.isPalindrome()}")
    println("${650.isPalindrome()}")
    println("${"656".isPalindrome()}")
    println("${"656".isPalindromeReversed()}")
    println("${"650".isPalindromeReversed()}")


    5 addition 5
}

infix fun Int.addition(b:Int){
    println("${this+b}")
}

private fun Int.isPalindrome(): Boolean {
    var rev: Int
    var sum: Int = 0
    var temp = this
    while (temp > 0) {
        rev = temp % 10
        sum = (sum * 10) + rev
        temp /= 10
    }
    return sum == this
}

// We can use same logic for String reverse
private fun String.isPalindrome(): Boolean {
    var rev = ""
    for (i in this.length downTo 1) {
        rev += this[i - 1]
    }
    return this == rev
}

private fun String.isPalindromeReversed():Boolean{
    val temp=this
    return temp == reversed()
}