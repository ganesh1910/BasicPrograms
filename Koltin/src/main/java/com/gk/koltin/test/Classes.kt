package com.gk.koltin



fun main() {

    val employee = Employee("Ganesh")
    employee.printName()
}

abstract class Person() {
   abstract val name: String
    abstract fun printName()

    init {
        printName()
        println("Person class init block")
    }
}

class Employee(override val name: String) : Person() {
    init {
        println("Employee class init block")
    }
    override fun printName() {
        println("Employee name is $name")
    }
}