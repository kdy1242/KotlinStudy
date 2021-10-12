package com.example.kotlinstudy

fun main() {
    // 오버라이딩과 추상화
    var r = Rabbit()
    r.eat()
    r.sniff()

}
// 추상화 - 선언부만 있고 기능이 구현되지 않은 추상함수, 추상함수를 포함하는 추상클래스라는 요소로 구성됨
abstract class Animal{  // 추상클래스는 미완성클래스이기때문에 단독으로는 인스턴스 만들수없음
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit: Animal(){
    override fun eat(){
        println("당근을 먹습니다")
    }
}