package com.gk.koltin

fun main() {

    var n1=0
    var n2=1
    for (i in 0..50){
        when(i){
            0 -> print("$i ")
            1 -> print("$i ")
            else -> {
                val n3 = n1 + n2
                n1=n2
                n2=n3
                print("$n3 ")
            }
        }
    }
}