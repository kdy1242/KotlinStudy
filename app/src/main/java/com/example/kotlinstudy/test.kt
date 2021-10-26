package com.example.kotlinstudy

// 함수의 argument 다루는 방법

// variable number of arguments (vararg)
// 같은 자료형을 개수에 상관없이 패러미터로 받고싶을때 사용

fun main() {
    sum(1, 2, 3, 4)
}

fun sum(vararg numbers: Int) {  // vararg 는 개수가 지정되지않은 패러미터라는 특징이 있으므로 다른 패러미터랑 같이쓸땐 반드시 맨 마지막에 위치해야함
    var sum = 0

    for(n in numbers) {
        sum += n
    }
    print(sum)
}