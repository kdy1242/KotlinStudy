package com.example.kotlinstudy

// 오브젝트
// 생성자 없이 객체를 직접 만들어냄

// 클래스는 인스턴스 객체를 만들기 위한 틀 -> 생성자로 인스턴스 만들어야 속성이나 함수 사용가능
// 단하나의 객체만으로 공통적인 속성과 함수를 사용해야하는 코드에서는 오브젝트 사용

// 오브젝트로 선언된 객체는 최초사용시 자동으로 생성, 이후에는 코드 전체에서 공용으로 사용 ㄱㄴ -> 프로그램이 종료되기전까지 공통적으로 사용될 내용을묶어 사용

fun main() {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)
}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}