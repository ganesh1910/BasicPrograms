package com.gk.koltin

fun main() {
    "Hello World".removeUsingSubString()
    "Hello World".removeUsingDrop()
    "Hello World".removeUsingFor()
}

fun String.removeUsingSubString() {
    println(this.substring(1,this.length - 1))
}

fun String.removeUsingDrop(){
    println(this.drop(1).dropLast(1  ))
}

fun String.removeUsingFor(){
    var temp=""
    for (i in indices){
        if(i!=0 && i!=this.length-1){
               temp+=this[i]
        }
    }
    println(temp)
}