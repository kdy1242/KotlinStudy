package com.example.kotlinstudy

// null 값 처리하는 방법
// nullable 변수를 null 상태로 속성이나 함수를 쓰려고하면 null pointer exception 이 발생함
// nullable 변수를 사용할 때는 null 체크 없이는 코드가 컴파일되지 않음

// ?. (null safe operator)
// 참조연산자를 실행하기 전에 먼저 객체가 null 인지 확인부터 하고
// 객체가 null 이라면 뒤따라오는 구문을 실행하지 않는 연산자

// ?: (elvis operator)
// 객체가 null 이 아니라면 그대로 사용하지만
// null 이라면 연산자 우측의 객체로 대체되는 연산자

// !!. (non-null assertion operator)
// 참조연산자를 사용할때 null 여부를 컴파일시 확인하지 않도록하여
// 런타임시 null pointer exception 이 나도록 의도적으로 방치하는 연산자

fun main() {
    var a: String? = "Kotlin Exam"

//    println(a?.toUpperCase())
//    println(a?:"default".toUpperCase())
//    println(a!!.toUpperCase())


    // null safe 연산자는 스코프 함수와 사용하면 더 편리함

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }   // a 가 null 이면 스코프 함수 전체가 수행되지 않음
    // null 을 체크하기 위해 if 문 대신 사용하면 상당히 편리한 기능
}