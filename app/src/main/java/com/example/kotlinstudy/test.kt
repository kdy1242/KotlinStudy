package com.example.kotlinstudy

// 변수의 고급 기술
// 지연 대리자 속성 (lazy delegate properties)
// 변수를 사용하는 시점까지 초기화를 자동으로 늦춰줌

// val 변수에 by 라는 키워드를 사용하여 lazy 라는 람다함수형태의 초기화함수를 사용하는 형태
// 코드에서는 선언시 즉시 객체를 생성 및 할당하여 변수를 초기화하는 형태를 가지고잇지만
// 실제 실행시에는 val 변수를 사용하는 시점에 초기화 과정을 진행함으로서 코드의 실행시간을 최적화할수있다

// 람다함수로 초기화가 진행되므로 함수안에 여러개의 구문이 들어갈수있으며 맨 마지막구문의 결과가 변수에 할당됨

fun main() {

    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)     // 이미 초기화를 했기때문에 다시 초기화구문 실행하지 않음

}