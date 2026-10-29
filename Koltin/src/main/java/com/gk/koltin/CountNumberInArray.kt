package com.gk.koltin

fun main() {
    val array = arrayOf(1, 2, 3, 6, 5, 98, 8, 8, 6, 4, 2, 3, 3, 3)
    val map = mutableMapOf<Int, Int?>()
    array.map {
        if (map.contains(it)) {
            map[it] = map[it]?.let { cnt -> cnt + 1 }
        } else {
            map[it] = 1
        }
    }
    println(map.toString())
}