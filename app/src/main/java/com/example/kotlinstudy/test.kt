package com.example.kotlinstudy

fun main() {
    var d = Dog()

    d.run()
    d.eat()
    // 여러개의 인터페이스나 클래스에서 같은 이름과 형태를 가진 함수를 구현하고잇다면
    // 서브클래스에서는 혼선이 일어나지않도록 반드시 오버라이딩하여 재구현해주어야함


    // --정리 --
    // 오버라이딩 - 이미 구현이 끝난 함수의 기능을 서브클래스에서 변경해야할때 사용
    // 추상화 - 형식만 선언하고 실제 구현은 서브클래스에 일임할때 사용
    // 인터페이스 - 서로다르 기능들을 여러개 물려주어야할때 유용한 기능
}
// 인터페이스 - 추상함수, 일반함수 모두가질수잇음 / 생성자 못가짐
// 인터페이스에서 구현부가잇는함수-> open 함수로 간주 /
// 구현부가 없는함수->abstract 함수로 간주, 별도의 키워드 없어도 서브클래스에서 구현및 재정의 ㄱㄴ
// 한번에 여러인터페이스 상속받을수잇어서 좀 더 유연한 설계가 가능하다
interface Runner{
    fun run()
}
interface Eater{
    fun eat(){
        println("음식을 먹습니다")
    }
}
class Dog : Runner, Eater{
    override fun run(){
        println("우다다다 뜁니다")
    }
    override fun eat(){
        println("허겁지겁 먹습니다")
    }
}