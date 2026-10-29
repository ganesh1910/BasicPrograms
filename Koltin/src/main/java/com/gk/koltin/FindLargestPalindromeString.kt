package com.gk.koltin

// Time complexity: O(n2) and Space Complexity: O(1)


fun expandAroundCenter(s: String, left: Int, right: Int): Int {
    var l = left
    var r = right
    while (l > 0 && r < s.length - 1 && s[l] == s[r]) {
        l--
        r++
    }
    return r - l - 1
}

fun longestPalindrome(s: String): String {
    if (s.isBlank()) return ""
    var start = 0
    var end = 0

    for (i in s.indices) {
        val len1 = expandAroundCenter(s, i, i)
        val len2 = expandAroundCenter(s, i, i + 1)

        val maxLen = maxOf(len1, len2)

        if (maxLen > end - start) {
            start = i - (maxLen - 1) / 2
            end = i + maxLen / 2
        }
    }
    return s.substring(start, end + 1)
}

fun main() {
    val input1 = "babad"
    println("Longest palindrome in '$input1': ${longestPalindrome(input1)}") // Output: "bab" or "aba"

    val input2 = "cbbd"
    println("Longest palindrome in '$input2': ${longestPalindrome(input2)}") // Output: "bb"
}