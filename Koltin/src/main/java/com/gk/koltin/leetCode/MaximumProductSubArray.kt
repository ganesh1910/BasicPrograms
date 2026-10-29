package com.gk.koltin.leetCode


/**
 * Given an integer array nums, find a subarray that has the largest product, and return the product.
 *
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * Note that the product of an array with a single element is the value of that element.
 *
 * Example 1:
 *
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 *
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

// Time complexity: O(n) , Space complexity: O(1)
private fun maxProductSubArray(nums: IntArray): Int {
    var minProduct = nums[0]
    var maxProduct = nums[0]
    var answer = nums[0]

    for (i in 1 until nums.size) {
        val num = nums[i]

        val tempMax = maxProduct
        val tempMin = minProduct

        maxProduct = maxOf(num, tempMax * num, tempMin * num)
        minProduct = minOf(num, tempMax * num, tempMin * num)

        answer = maxOf(answer, maxProduct)
    }
    return answer
}

fun main() {
    val array = intArrayOf(2,3,-2,4)
    println(maxProductSubArray(array).toString())

    val array2 = intArrayOf(-2,0,-1)
    println(maxProductSubArray(array2).toString())

    val array3 = intArrayOf(-2,3,-4)
    println(maxProductSubArray(array3).toString())
}