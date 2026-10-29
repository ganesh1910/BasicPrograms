package com.gk.koltin.leetCode

import kotlin.math.max

// Time complexity: O(n) and Space Complexity: O(1)
fun maxProfit(prices: Array<Int>): Int {
    var sellPrice = prices[0]
    var profit = 0
    for (price in prices) {
        if (price < sellPrice) {
            sellPrice = price
        } else {
            val maxProfit = price - sellPrice
            profit = if (maxProfit > profit) maxProfit else profit
        }
    }
    return profit
}

// Time complexity: O(n) and Space Complexity: O(1)
fun maxProfit2(prices: Array<Int>): Int {
    var sellPrice = prices[0]
    return prices.fold(0) { profit, price ->
        if (price < sellPrice) {
            sellPrice = price
            profit
        } else {
            max(profit, price - sellPrice)
        }
    }
}


fun main() {
    val array = arrayOf(7, 1, 5, 3, 6, 4)
    println(maxProfit(array))
    println(maxProfit2(array))
}
