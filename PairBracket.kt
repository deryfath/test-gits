package com.example.testkotlinlogic

import java.util.*


fun main(args :Array<String>) {
    var strBracket = "{[(])}"

    print(checkPairBracket(strBracket))
}

fun checkPairBracket(str:String):Boolean{


    val stack: Deque<Char> = ArrayDeque<Char>()

    for (i in 0 until str.length) {
        val x: Char = str.get(i)
        if (x == '(' || x == '[' || x == '{') {
            stack.push(x)
            continue
        }

        if (stack.isEmpty()) return false
        when (x) {
            ')' -> {
                stack.pop()
                if (x == '{' || x == '[') return false
            }
            '}' -> {
                stack.pop()
                if (x == '(' || x == '[') return false
            }
            ']' -> {
                stack.pop()
                if (x == '(' || x == '{') return false
            }
        }
    }
    return stack.isEmpty()

}
