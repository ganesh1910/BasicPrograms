package com.gk.koltin

fun main() {
    val filteredStudents = students.filter { it.subscription.course.isPaid }
//    println("Filtered students: $filteredStudents")
    println("Courses: ${getCourses()}")
}

fun getCourses(): Map<Course, Int> {
    return students.filter { it.subscription.course.isPaid }.groupingBy { it.subscription.course }
        .eachCount()
        .entries
        .sortedByDescending { it.value }
        .take(3)
        .associate { it.key to it.value }
}

val students = listOf(
    Student(1, "Alice", Subscription(Course(1, "Kotlin", true))),
    Student(2, "Bob", Subscription(Course(2, "Java", false))),
    Student(2, "Bob", Subscription(Course(2, "Java", true))),
    Student(2, "Bob", Subscription(Course(2, "Java", true))),
    Student(2, "Bob", Subscription(Course(2, "Mava", true))),
    Student(2, "Bob", Subscription(Course(2, "Dava", true))),
    Student(3, "Charlie", Subscription(Course(1, "Kotlin", true)))
)

data class Student(
    val id: Int,
    val name: String,
    val subscription: Subscription
)

data class Subscription(
    val course: Course
)

data class Course(
    val id: Int,
    val name: String,
    val isPaid: Boolean
)