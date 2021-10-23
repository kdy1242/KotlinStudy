package com.example.kotlinstudy

// 리스트
// 데이터를 모아 관리하는 컬렉션 클래스를 상속받는 서브클래스중 가장 단순한 형태
// 여러개의 데이터를 원하는 순서로 넣어 관리하는 형태

// 1 List<T> - 생성시에 넣은 객체를 대체, 추가, 삭제할 수 없음
// 2 MutableList<T> - 대체, 추가, 삭제 ㄱㄴ

// 리스트 만들때는 listOf(), mutableListOf() 사용

// MutableList 에서는
// 요소의 추가 add(데이터), add(인덱스, 데이터)
// 삭제 remove(데이터), removeAt(인덱스)
// 무작위 섞기 shuffle()
// 정렬 sort()
// 대체 list[인덱스] = 데이터

fun main() {
    var a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a){
        println("${fruit}")
    }

    println()

    var b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}
// 리스트는 목록이 필요한 모든 코드에서 가장 편리하게 사용할수있는 컬렉션