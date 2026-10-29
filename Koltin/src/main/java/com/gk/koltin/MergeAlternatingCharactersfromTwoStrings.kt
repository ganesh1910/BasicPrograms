package com.gk.koltin

//  Merge Alternating Characters from Two Strings
/* Example
    val a = "abcd"
    val b = "1234"
    // Output: a1b2c3d4
*/

fun main() {
    val a = "abcd"
    val b = "1234"
    println("Merge Alternative String  = ${mergeString(a, b)}")

    val c = "hhjbkjhkjhkjk"
    val d = "654654654654654654654"
    println("Merge Alternative String  = ${mergeString(c, d)}")

}

// Time complexity O(n + m) - Space complexity O(n + m)
fun mergeString(a: String, b: String): String {
    val result = StringBuilder()
    val length = maxOf(a.length, b.length)

    for (i in 0 until length) {
        if (i < a.length) result.append(a[i])
        if (i < b.length) result.append(b[i])
    }

    return result.toString()
}