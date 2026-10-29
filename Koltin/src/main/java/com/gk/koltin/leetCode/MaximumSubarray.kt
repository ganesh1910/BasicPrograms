package com.gk.koltin.leetCode

import kotlin.math.max

/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */

fun findMaxSubArraySum(nums: IntArray): Int {
    var maxSoFar = nums[0]
    var currentMax = nums[0]

    for(i in 1 until nums.size) {
        currentMax= max(nums[i], currentMax + nums[i])
        maxSoFar = max(maxSoFar, currentMax)
    }
    return maxSoFar
}

private fun maxSubArraySum(nums: IntArray): Int {
    var maxSum = nums[0]
    var currentSum = nums[0]
    for (i in 1 until nums.size) {
        currentSum = max(nums[i], currentSum + nums[i])
        maxSum = max(maxSum, currentSum)
    }
    return maxSum
}

fun main() {
    val nums = intArrayOf(1,3,6,9,-5,6)
    println(findMaxSubArraySum(nums).toString())
    println(maxSubArraySum(nums).toString())
}