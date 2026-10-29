package com.gk.koltin

// Time complexity: O(n) & Space complexity: O(1)
private fun findMissingNumber(arr: Array<Int>, n: Int): Int {
    val totalSumOf = (n * (n+1)) / 2
    val arrSum = arr.sum()
    var arrSum2 = 0
    arr.forEach { arrSum2 += it }
    println("$totalSumOf $arrSum $arrSum2")
    return totalSumOf - arrSum
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    val missingNumber = findMissingNumber(arr, 6)
    println("Missing number is $missingNumber")

    val result = findMissingNumber(intArrayOf(15, 16, 17, 19, 20))
    println(result)
}

// Time complexity: O(n) & Space complexity: O(1)
fun findMissingNumber(arr: IntArray): Int {
    val n = arr.size + 1
    val totalSum = n * (n + 1) / 2
    val arrSum = arr.sum()
    return totalSum - arrSum
}

