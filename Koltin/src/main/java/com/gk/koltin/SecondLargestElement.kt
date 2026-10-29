package com.gk.koltin

fun secondLargest(arr: Array<Int>): Int? {
    val sortedArray = arr.distinct().sorted()
    return if (sortedArray.size > 1) sortedArray[sortedArray.size - 2] else null
}

fun secondLargest2(arr: Array<Int>): Int? {
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    for (num in arr) {
        if (num > largest) {
            secondLargest = largest
            largest = num
        } else if (num > secondLargest && num != largest) {
            secondLargest = num
        }
    }
    return if (secondLargest == Int.MIN_VALUE) null else secondLargest
}

fun main() {
    val result = secondLargest(arrayOf(1, 2, 6, 8, 1, 3, 9))
    val result2 = secondLargest2(arrayOf(1, 2, 6, 8, 1, 3, 9))
    println("secondLargest $result")
    println("secondLargest2 $result")
}