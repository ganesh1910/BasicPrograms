package com.gk.koltin

 fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val index = binarySearch1(array, target = 1)
    val index2 = binarySearch2(array, target = 8)
    val recIndex = recBinarySearch(array, target = 8, left = 0, right = array.size - 1)
    println("Target found at index $index")
    println("Target found at index $index2")
    println("Target found at index $recIndex")
    println("Target found at index ${array.binarySearch(8)}")
}  

// Iterative Implementation - Time Complexity -> O(logN) - Space Complexity -> O(1)
private fun binarySearch1(arr: Array<Int>, target: Int): Int {
    var start = 0
    var end = arr.size -1

    while (start <= end) {
//        val mid = (start + end) / 2
        val mid = start + (end - start) / 2 // Int overflow case

        // both mid are same as math
        // mid = 2start + end - start / 2 -> start + end / 2

        when {
            arr[mid] > target -> end = mid - 1
            arr[mid] < target -> start = mid + 1
            else -> return mid
        }
    }
    return -1
}

// Code Simplicity
private fun binarySearch2(arr: Array<Int>, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) /2

        when {
            arr[mid] == target -> return mid
            arr[mid] > target -> right = mid -1
            else -> left = mid + 1
        }
    }
    return -1
}

// Recursive binary search - Time Complexity -> O(logN) - Space Complexity -> O(logN)
private fun recBinarySearch(arr: Array<Int>, target: Int,left: Int,right: Int): Int {
    if (left <= right) {
        val mid = left + (right - left) / 2
        when {
            target > arr[mid] -> recBinarySearch(arr,target, mid + 1, right)
            target < arr[mid] -> recBinarySearch(arr, target, left, mid -1)
            else -> mid
        }
    }
    return -1
}