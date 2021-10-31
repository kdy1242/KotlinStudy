package com.example.kotlinstudy

// 컬렉션함수 1
// 컬렉션 함수 - list, set, map 과 같은 컬렉션 또는 배열에 일반 함수, 람다 함수 형태를 사용하여
// for 문 없이도 아이템을 순회하며 참조하거나 조건을 걸고, 구조의 변경까지 가능한 여러가지 함수를 지칭함

// 컬렉션함수사용하면 반복문과 조건문을 사용하는경우를 대부분 대체할수잇다는 장점이 잇다
fun main() {
    val nameList = listOf("박길동", "김길동", "최길동", "신길동", "홍길동")

    nameList.forEach { print(it + " ") }    // 컬렉션에 포함된 모든 아이템을 it 이라는 변수로 순서대로 참조할수잇다
    println()

    println(nameList.filter { it.startsWith("김") }) // 중괄호안에서 it에 조건을 걸어주면 조건에맞는객체만 다시 컬렉션으로 만들어서 반환

    println(nameList.map { "이름 : " + it })  // 중괄호안에서 it에 수식을 적용하여 값을 변경하면 그 값을 컬렉션으로 만들어 반환(일괄적으로 값을 변경할수잇음)

    println(nameList.any { it == "한길동" })   // 하나라도 조건에 맞으면 true
    println(nameList.all { it.length == 3 })    // 모두 조건에 맞으면 true
    println(nameList.none { it.startsWith("이") })   // 하나도 조건에 맞지 않으면 true

    println(nameList.first { it.startsWith("김") })  // 일반함수로 사용할경우 컬렉션의 첫번째 아이템 반환, 람다함수형태로 it에 조건을 걸어주면 조건에 맞는 첫번째 아이템을 반환
    println(nameList.last { it.startsWith("김") })   // 마지막 아이템을 반환
    // first -> find 로 대체가능
    // last -> findLast 로 대체가능
    // first, last 사용할때 조건에 맞는 객체가 없는경우(=컬렉션이 비어잇는 경우) NoSuchElementException 발생할수잇음
    // 이때는 firstOrNull, lastOrNull 사용하면 객체가 없는경우 null 을 반환해줌
    println(nameList.count { it.contains("최") })    // 일반함수로 사용하면 포함된 모든 아이템의 개수 반환, 중괄호와함께 it에 조건을 걸어주면 조건에맞는 아이템개수 반환
}