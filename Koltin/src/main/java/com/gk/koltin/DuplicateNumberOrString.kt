package com.gk.koltin

fun main() {
    arrayOf(25, 63, 5, 8, 6, 9, 4, 2, 8).duplicateNumbersWithoutNested()
    arrayOf(25, 63, 5, 8, 6, 9, 4, 2, 8).printDuplicate()
    arrayOf("A", "b", "F", "G", "K", "G", "a").duplicateNumbersWithoutNested()
}

private fun Array<Int>.duplicateNumbersWithoutNested() {
    val temp = mutableListOf<Int>()
    val temp2 = mutableListOf<Int>()
    forEach { num ->
        if (temp.contains(num)) {
            temp2.add(num)
        } else {
            temp.add(num)
        }
    }

    val result = filter { temp2.contains(it) }
    println(result)
}

private fun Array<String>.duplicateNumbersWithoutNested() {
    val temp = mutableListOf<String>()
    val temp2 = mutableListOf<String>()
    forEach { num ->
        if (temp.contains(num)) {
            temp2.add(num)
        } else {
            temp.add(num)
        }
    }

    val result = filter { temp2.contains(it) }
    println(result)
}

private fun Array<Int>.printDuplicate() {
    val set = mutableListOf<Int>()
    for (i in indices) {
        for (j in (i + 1) until (this.size)) {
            if (this[i] == this[j]) {
                set.add(this[i])
                set.add(this[i])  
            }
        }
    }
    println(set)
}