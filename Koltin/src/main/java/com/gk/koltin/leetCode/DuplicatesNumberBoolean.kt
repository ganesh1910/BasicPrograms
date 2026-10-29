package com.gk.koltin.leetCode

/**
* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
* Note that you must do this in-place without making a copy of the array.
*/

fun duplicateNumbers(nums: IntArray): Boolean {
    return nums.distinct().size != nums.size
}

// Time complexity O(n2) space complexity O(n)
fun duplicateNumbers2(nums: IntArray): Boolean {
    for (index in nums.indices) {
        for (nextIndex in index+1 until nums.size){
            if (nums[index] == nums[nextIndex]) return true
        }
    }
    return false
}

// Time complexity O(n) space complexity O(n)
fun duplicateNumbers3(nums: IntArray): Boolean {
    val seen = HashSet<Int>()
    nums.forEach {
        if (!seen.add(it)) {
            return true
        }
    }
    return false
}

fun main() {
    val intArray = intArrayOf(1,3,5,2,8,6,1)
    println("${duplicateNumbers(nums = intArray)}")
    println("${duplicateNumbers2(nums = intArray)}")
    println("${duplicateNumbers3(nums = intArray)}")
}