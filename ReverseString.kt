package com.example.testkotlinlogic


fun main(args: Array<String>){
    val arrChar = mutableListOf<Char>(
        'h','e','l','l','0'
    )

    reverseString(arrChar)
    println(arrChar)
}

fun reverseString(arrChar:MutableList<Char>) {
    if(arrChar==null || arrChar.size<=1)
        return

    val charVal = arrChar.removeAt(0)
    reverseString(arrChar)
    arrChar.add(charVal);

}

