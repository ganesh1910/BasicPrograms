package com.gk.koltin

fun main() {
    println("Is Anagram ${isAnagram("anagram", "nagaram")}")
    println("Is Anagram ${isAnagram("anagram", "894645")}")
    println("Is Anagram Sort ${isAnagramSort("anagram", "894645")}")
    println("Is Anagram Sort ${isAnagramSort("anagram@52", "nagaram52@")}")
    println("Is Anagram ${isAnagramString("anagram", "nagaram")}")
    println("Is Anagram ${isAnagramString("anagram", "naglkaram")}")
}

// Time complexity = O(n + m) - Space complexity = O(1)
private fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val map1 = mutableMapOf<Char, Int>()

    s.forEach {
        map1[it] = map1.getOrDefault(it, 0) + 1
    }

    t.forEach {
        val count = map1.getOrDefault(it, 0)
        if (count == 0) return false
        map1[it] = count - 1
    }
    return true
}

// Time complexity = O(nlogn + mlogm) - Space complexity = O(n+m) or O(1)
private fun isAnagramSort(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    return s.toCharArray().sorted() == t.toCharArray().sorted()
}


// Time complexity = O(n) - Space complexity = O(1)
private fun isAnagramString(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val count = IntArray(26)
    for(i in s.indices) {
        count[s[i] - 'a']++
        count[t[i] - 'a']--
    }
    return count.all { it == 0 }
}