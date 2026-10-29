package com.gk.koltin

fun main() {
    println("${656.isPalindrome()}")
    println("${650.isPalindrome()}")
    println("${"656".isPalindrome()}")
    println("${"656".isPalindromeReversed()}")
    println("${"ABBA".isPalindromeReversed()}")
    println("${"ABBA".isTwpPointerPolidrome()}")
}


// Time complexity O(n) - Space complexity O(1)
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

// Time complexity O(n^2) - Space complexity O(n)
// String concat
private fun String.isPalindrome(): Boolean {
    var rev = ""
    for (i in this.length downTo 1) {
        rev += this[i - 1]
    }
    return this == rev
}

// Time complexity O(n^2) - Space complexity O(n)
private fun String.isPalindromeReversed(): Boolean {
    val temp = this
    return temp == reversed()
}

// Time complexity O(n) - Space complexity O(1)
private fun String.isTwpPointerPolidrome(): Boolean {
    var left = 0
    var right = length - 1
    while (left < right) {
        if (this[left] != this[right]) return false
        left++
        right--
    }
    return true
}