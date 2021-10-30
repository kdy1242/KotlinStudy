package com.example.kotlinstudy

// Map
// 코틀린이 기본적으로 지원하는 컬렉션 클래스

// 객체를 넣을때 그 객체를 찾아낼수있는 key 를 쌍으로 넣어주는 컬렉션

// key(객체를 찾기위한 값), value(키와 연결된 객체)는 MutableMap.MutableEntry 에 담겨있음
// 객체의 위치가 아닌 고유한 키를통해 객체를 참조하는 특징을 가지고잇음
// 같은키에 다른 객체를 넣으면 기존의 객체가 대체됨

// Map<K, out V>      MutableMap<K, V>
//                    추가, 삭제 가능
// 요소의 추가, 삭제 - put(키, 값), remove(키)

fun main() {
    val a = mutableMapOf("홍길동" to "홍씨",
                         "김길동" to "김씨",
                         "박길동" to "박씨")

    for(entry in a) {
        println("${entry.key} : ${entry.value}")
    }

    a.put("황길동", "황씨")
    println(a)

    a.remove("박길동")
    println(a)

    println(a["홍길동"])
}