package com.gk.koltin


/**
 * Premutation of string
 * Example abc => abc -> acb -> bac -> bca
 */

// Time Complexity O(n.n!) and space complexity O(n)
private fun PremutationOfString(s: String): List<String> {
    if (s.length <= 1) return listOf(s)

//    println("Outer String = $s")
    val mutableList = mutableListOf<String>()
    for (i in s.indices) {
//        println("Inner String $i = $s")
        val char = s[i]
//        println("SubStrings $i ${s.substring(0, i)}  ${s.substring(i + 1)}")

        val remaining = s.substring(0, i) + s.substring(i + 1)
//        println("Before Inner For Loop $i = $char $remaining")
        for (permutation in PremutationOfString(remaining)) {
            mutableList.add(char + permutation)
//            println("for Loop = $char + $permutation")
        }
    }
    return mutableList
}

fun main() {
    println("${PremutationOfString("abcd")}")
}