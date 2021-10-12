package com.example.kotlinstudy

fun main() {
    // 클래스의 생성자
    // 생성자 -> 새로운 인스턴스를 만들기 위해 호출하는 특수한 함수
    // 생성자 기능 - 인스턴스 속성 초기화, 인스턴스 생성시 필요한 구문을 수행
    // init -> 패러미터나 반환형이 없는 특수한 함수, 생성자를 통해 인스턴스가 만들어질때 호출되는 함수

    var a = Person("홍길동", 1990)
    var b = Person("김길동", 1997)
    var c = Person("박길동", 2004)
    
    var d = Person("최길동")
    var e = Person("한길동")

}

class Person (var name:String, val birthYear:Int){
    // 기본 생성자 - 클래스를 만들 때 기본으로 선언
    init{
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
    
    // 보조생성자 -> 기본 생성자와 다른 형태의 생성자를 제공하여 인스턴스 생성시 편의 제공, 추가적인 구문을 수행하는 기능 제공
    // 보조생성자 만들때 반드시 기본생성자 통해서 속성 초기화해야됨
    constructor(name:String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}
