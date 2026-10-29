package com.gk.koltin

fun main() {
    arrayOf(25, 63, 5, 8, 6, 9, 4, 2, 6, 8).duplicateNumbersWithoutNested()
    arrayOf(25, 63, 5, 8, 6, 9, 6, 4, 2, 8).printDuplicate()
    arrayOf(25, 63, 5, 8, 6, 9, 6, 4, 2, 8).printDuplicate2()
    arrayOf("A", "b", "F", "G", "K", "G", "a").duplicateNumbersWithoutNested()
}

private fun <T> Array<T>.duplicateNumbersWithoutNested() {
    val seen = mutableListOf<T>()
    val duplicates = mutableListOf<T>()
    forEach { num ->
        if (num in seen) {
            duplicates.add(num)
        } else {
            seen.add(num)
        }
    }

//    val result = filter { temp2.contains(it) }
    println(duplicates.toString())
}

private fun Array<String>.duplicateCharactersWithoutNested() {
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

data class MyDate(val day: Int, val month:Int, val year:Int): Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> day - other.day
        }
    }
}

private fun Array<Int>.printDuplicate() {
    val set = mutableListOf<Int>()
    for (i in indices) {
        for (j in (i + 1) until (this.size)) {
            if (this[i] == this[j]) {
                set.add(this[i])
                println(this[i])
            }
        }
    }
    println(set)
}

private fun Array<Int>.printDuplicate2() {
    val duplicates = this.groupingBy { it }.eachCount().filter { it.value > 1 }.keys
    println("Grouping $duplicates")
}

private fun removeDuplicates(num :List<Int>): List<Int> {
    return num.distinct()
}

private fun removeDuplicates2(num :List<Int>): List<Int> {
    return num.filterIndexed { index, _ -> num.indexOf(num[index]) == index }
}

private fun removeDuplicates3(num :List<Int>): List<Int> {
    val mutableList1 = mutableListOf<Int>()
    num.forEach {
        if (!mutableList1.contains(it)) {
            mutableList1.add(it)
        }
    }
    return mutableList1
}