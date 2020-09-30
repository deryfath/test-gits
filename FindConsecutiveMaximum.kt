package com.example.testkotlinlogic

fun main(args :Array<String>){
    var arrInt = mutableListOf<Int>(1,0,0,1,0,1,1)

    var counter = 0

    arrInt.forEach {
        if (it==1){
            counter++
        }else if (it==0){
            counter=0
        }
    }

    print(counter)
}