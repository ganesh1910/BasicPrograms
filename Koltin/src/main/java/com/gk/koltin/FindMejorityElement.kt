package com.gk.koltin

private fun findMajorityElement(arr: Array<Int>): Int {
    var count = 0
    var candidate = -1

    for (num in arr) {
       if (count == 0) candidate = num
        count += if (num == candidate) 1 else -1
    }

    count = 0
    for (num in arr) {
        if (num == candidate) count++
    }

    return if (count > arr.size / 2) candidate else -1
}

private fun findMajorityElement2(arr: Array<Int>): Int? {
    return arr.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key
}


fun main() {

    println("Majority Element ${findMajorityElement(arrayOf(6, 2, 2, 1, 1, 1, 2, 2))}")
    println("Majority Element ${findMajorityElement2(arrayOf(5,2, 2, 1, 1, 1, 2, 2))}")
}