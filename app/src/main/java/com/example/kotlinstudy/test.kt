package com.example.kotlinstudy

// 변수의 동일성 체크

// 내용의 동일성 - 메모리상에 서로 다른곳에 할당된 객체라고해도 그 내용이 같다면 동일하다고 판단하는것
// 객체의 동일성 - 서로 다른 변수가 메모리상에 같은 객체를 가리키고 있을때만 동일하다고 판단

// 내용의 동일성 판단하는 연산자 ==
// 객체의 동일성 판단하는 연산자 ===

// 내용의 동일성은 코틀린의 모든 클래스가 내부적으로 상속받는 Any 라는 최상위 클래스의
// equals() 함수가 반환하는 Boolean 값으로 판단하게됨

// 기본 자료형에는 자료형의 특징에 따라 equals() 함수가 이미 구현되어있지만
// 우리가 커스텀 클래스를 만들때는 equals()를 상속받아 동일성을 확인해주는 구문을 별도로 구현해야함

fun main() {
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    println(a == b)     // true
    println(a === b)    // false

    println(a == c)     // true
    println(a === c)    // true

    println(a == d)     // false
    println(a === d)    // false
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Product) {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}