package com.example.kotlinstudy

// 함수의 argument 다루는 방법

// 패러미터를 받아야하는 함수지만 별다른 패러미터가 없더라도 기본값으로 동작해야한다면
// default arguments 사용

// named arguments - 패러미터의 순서와 관계없이 패러미터의 이름을 사용하여 직접 패러미터의 값을 할당하는 기능

fun main() {
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    deliveryItem("선물", destination = "친구집") // named arguments
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}