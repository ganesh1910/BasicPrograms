package com.gk.koltin

fun isSubset(arr1: Array<Int>, arr2: Array<Int>): Boolean {
    val set1 = arr1.toHashSet()

    for (element in arr2) {
        if (!set1.contains(element)) {
            return false
        }
    }
    return true
}

fun main() {
    val arr1 = arrayOf(11, 1, 13, 21, 3)
    val arr2 = arrayOf(11, 3, 7, 1)
    val result = isSubset(arr1, arr2)
    println(result)

    val arr3 = arrayOf(11, 1, 13, 21, 3)
    val result2 = isSubset(arr1, arr3)
    println(result2)
}