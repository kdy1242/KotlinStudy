package com.example.kotlinstudy

fun main() {
    // 조건문과 비교연산자
    var a = 10
    if(a > 10){
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }
    // is 연산자, !is 연산자
    // is 좌측엔 변수, 우측엔 확인할 자료형쓰면
    // 좌측변수가 우측 자료형에 호환되는지 여부를 체크하고 형변환까지 한번에 진행시켜줌

    doWhen(1)
    doWhen("ABC")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
}

// 다중 조건문 when
fun doWhen(a: Any) {    // Any : 어떤 자료형이든 상관없이 호환되는 코틀린의 최상위 자료형
    when(a) {   // 표현식으로서의 역할을 하게 하려면 조건으로 동작 대신 값을 써줘야함
        1 -> println("정수 1입니다")
        "ABC" -> println("ABC 입니다")
        is Long -> println("Long 타입입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")     // 위의 어떤 조건값에도 맞지 않는 경우 실행
        // 등호나 부등호의 사용은 불가능함
    }
}