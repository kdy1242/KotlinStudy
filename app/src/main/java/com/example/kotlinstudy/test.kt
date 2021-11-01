package com.example.kotlinstudy

// 컬렉션함수 2

fun main() {
    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(Person("유길동", 1990),
                            Person("조길동", 1992),
                            Person("주길동", 1999),
                            Person("최길동", 2003))

    println(personList.associateBy { it.birthYear })    // 아이템에서 key 를 추출하여 map 으로 변환하는 함수
    println(personList.groupBy { it.name })     // key 가 같은 아이템끼리 배열로 묶어 map 으로 만드는 함수

    val (over98, under98) = personList.partition { it.birthYear > 1998 }    // 아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌
    println(over98)
    println(under98)
}