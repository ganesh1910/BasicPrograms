package com.gk.koltin

fun main() {
    val str = "luckbad"
    val target = "bad"
    val index = str.indexOf(target)
    println("$index")
    println("${indexOfTarget(str, target)}")
    println("${indexOfTarget2(str, target)}")
}

private fun indexOfTarget(str: String, target: String): Int {
    if (str.length <= target.length) return -1
    for(i in 0..str.length) {
        if(str.regionMatches(i, target, 0, target.length)) {
            return i
        }
    }
    return -1
}

private fun indexOfTarget2(str: String, target: String): Int {
    if (str.length <= target.length) return -1
    for(i in 0..str.length) {
        if (str.substring(i, i + target.length) == target) {
            return i
        }
    }
    return -1
}