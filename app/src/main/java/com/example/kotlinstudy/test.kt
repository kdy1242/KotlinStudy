package com.example.kotlinstudy

// Set
// 코틀린이 기본적으로 지원하는 컬렉션 클래스

// List 와 달리 순서가 정렬되지 않으며 중복이 허용되지 않는 컬렉션
// 인덱스로 위치 지정하여 객체를 참조할수 없음, contains 로 객체가 set 안에 존재하는지를 확인하는 식으로만 사용

// Set<out T>      MutableSet<T>
// 객체의 추가, 삭제가 가능한지 여부에 따라 사용
// 추가, 삭제 - add, remove

fun main() {
    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a) {
        println("${item}")
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))
}