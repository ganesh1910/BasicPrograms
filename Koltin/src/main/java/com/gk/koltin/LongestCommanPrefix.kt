package com.gk.koltin

//Find the Longest Common Prefix of a List of Strings
fun main() {
    val result = longestCommonPrefix(listOf("flower", "flow", "flight"))
    println(result)
}

// Time complexity O(n x m) - Space complexity O(1)
fun longestCommonPrefix(strs: List<String>): String {
   if (strs.isEmpty()) return ""
    var prefix = strs[0]
    for (i in 1 until strs.size) {
        while(strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}