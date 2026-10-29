package com.gk.koltin.leetCode

/*
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

// Complexity Time = O(n) and Space = O(n)
private fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i] // check the target - current value to get the complement
        if (map.containsKey(complement)) {
//            println("$i ${map[complement]}")
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}

fun main() {
    val array = intArrayOf(3,3,1,1)
    val result = twoSum(array, 6)
    println("Sum ${result.contentToString()}")
}

