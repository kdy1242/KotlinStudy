package com.example.kotlinstudy

fun main() {
    // 흐름제어와 논리연산자
    // break, continue
    for(i in 1..10) {
        if(i == 3) break    // 1 2
        println(i)
    }
    for(i in 1..10) {
        if(i == 3) continue     // 1 2 4 5 6 7 8 9 10
        println(i)
    }

    // 다중 반복문에서 break 나 continue 가 적용되는 반복문을 label 을 통해 지정할 수 있는 기능
    loop@for(i in 1..10) {
        for(j in 1..10) {
            if(i == 1 && j == 2) break@loop // 레이블이 달린 반복문을 기준으로 즉시 break 를 시켜줌 // continue 도 마찬가지
            println("i : $i, j : $j")
        }
    }

    // 논리연산자
    // &&(and), ||(or), !(not)
    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    var a = 6
    var b = 4

    println(a > 5 && b < 5)
}
