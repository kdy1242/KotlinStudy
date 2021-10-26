package com.example.kotlinstudy

// infix 함수
// 연산자처럼 쓸수있는 infix 함수

fun main() {
    println(6 multiply 4)   // 좌측에 붙은 6이 infix 함수가 적용되는 객체 자신 (this)
                            // 우측에 붙은 4가 패러미터인 x에 해당함

    println(6.multiply(4))

    // 클래스 안에서 infix 함수를 선언할때는 적용할 클래스가 자기 자신이므로 클래스이름은 쓰지않음
}
infix fun Int.multiply(x: Int): Int = this * x
// 함수를 정의할때 앞에 infix 붙이기
// 함수 이름을 infix 함수가 적용될 자료형.이름으로 지정