package com.example.kotlinstudy

// 함수의 argument 다루는 방법

// overloading - 같은 스코프 안에서 같은 이름의 함수를 여러개 만들기 ㄱㄴ
// 이름이 같더라도 패러미터의 자료형이 다르거나 갯수가 다르다면 서로다른함수로 동작 가능
// 다만 패러미터의 이름만 다르게묶고 자료형과 갯수가 동일하면 오버로딩 못함

fun main() {
    read(7)
    read("감사합니다")
}

fun read(x: Int) {
    println("숫자 &x 입니다")
}

fun read(x: String) {
    println(x)
}