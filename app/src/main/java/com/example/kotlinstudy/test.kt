package com.example.kotlinstudy

fun main() {
    // 클래스의 기본 구조
    // 속성(고유의 특징값), 함수(기능을 구현)
    // 인스턴스 : 클래스를 이용해서 만들어내는 서로 다른 속성의 객체를 지칭하는 용어

    var a = Person("홍길동", 1990)
    var b = Person("김길동", 1997)
    var c = Person("박길동", 2004)

    a.introduce()
    b.introduce()
    c.introduce()

}

class Person(var name:String, var birthYear:Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다")
    }
}
