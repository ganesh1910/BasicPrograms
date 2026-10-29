package com.gk.koltin

// Find the Third Largest Element in an Array

// Time Complexity - O(n) Space Complexity - O(1)
private fun thirdLargestElement(array: IntArray): Int? {
    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE
    var third = Int.MIN_VALUE

    if (array.size < 3) return null

    for (num in array) {
        when {
            num > first -> {
                third = second
                second = first
                first = num
            }

            num > second && num != first -> {
                third = second
                second = num
            }

            num > third && num != second -> {
                third = num
            }
        }
    }
        return if (third != Int.MIN_VALUE) third else null
}

fun main() {
    val array = intArrayOf(5,3,6,78,9,1,63,88)
    val thirdNumber = thirdLargestElement(array)
    println("A third largest number is $thirdNumber")
}