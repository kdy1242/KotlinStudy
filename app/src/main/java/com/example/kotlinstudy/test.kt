package com.example.kotlinstudy

fun main() {
    // 오버라이딩과 추상화
    // 오버라이딩 - 같은 이름과 형태로 된 함수를 다시 구현

    var t = Tiger()
    t.eat()

}

// open - 클래스가 상속될수있도록 클래스 선언시 붙여주는 키워드
open class Animal {
    open fun eat(){
        println("음식을 먹습니다")
    }
}

class Tiger: Animal(){
    override fun eat() {
        println("고기를 먹습니다")
    }
}