package com.gk.koltin

// Time complexity: O(nlogn) & Space complexity: O(1)
fun maxProduct(arr: Array<Int>): Int {
    val sorted = arr.sorted()
    val size = sorted.size
    return sorted[size - 1] * sorted[size - 2]
}

// Time complexity: O(n) & Space complexity: O(1)
fun maxProduct2(arr: Array<Int>): Int {
    if (arr.size > 2) {
        var maxInt = Int.MIN_VALUE
        var maxInt2 = Int.MIN_VALUE

        arr.forEach { num ->
            if (num > maxInt) {
                maxInt2 = maxInt
                maxInt = num
            } else if (num > maxInt2) {
                maxInt2 = num
            }
        }
        return maxInt * maxInt2
    }
    return 0
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    val result = maxProduct(arr)
    println(result)
    val result2 = maxProduct2(arrayOf(6,3,6,9,4,6))
    println(result2)
}