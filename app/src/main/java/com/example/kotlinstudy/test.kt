package com.example.kotlinstudy

// Enum Class

// enumerated type(열거형)
// enum class 내의 상태를 구분하하기위한 객체들을 이름을 붙여 여러개 생성해두고
// 그중 하나의 상태를 선택하여 나타내기위한 클래스

// enum 클래스 안의 객체들은 관행적으로 상수를 나타낼때 사용하는 대문자로 기술

// enum 의 객체들을 고유한 속성을 가질수잇다
// enum 의 생성자를 만들어 속성을 받도록하면 객체를 선언할때 속성도 설정할수잇음

// 일반클래스처럼 함수도 가질수잇다
// 객체의 선언이 끝나는 위치에 세미콜론을 추가하고 함수를 기술

fun main() {
    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP
}