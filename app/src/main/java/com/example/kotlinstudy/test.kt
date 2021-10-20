package com.example.kotlinstudy

// 오브젝트
// 생성자 없이 객체를 직접 만들어냄

// 클래스는 인스턴스 객체를 만들기 위한 틀 -> 생성자로 인스턴스 만들어야 속성이나 함수 사용가능
// 단하나의 객체만으로 공통적인 속성과 함수를 사용해야하는 코드에서는 오브젝트 사용

// 오브젝트로 선언된 객체는 최초사용시 자동으로 생성, 이후에는 코드 전체에서 공용으로 사용 ㄱㄴ -> 프로그램이 종료되기전까지 공통적으로 사용될 내용을묶어 사용

// Companion Object -> 기존 클래스 안에서도 오브젝트 만들수 ㅇㅇ
// 클래스의 인스턴스 기능은 그대로 사용, 인스턴스간에 공용으로 사용할 속성과 함수를 만드는것(기존의 static 멤버와 비슷)

fun main() {
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")   // 서로 다른 인스턴스임에도 companion object 내에있는 total 을 공유하고 있기 때문에 누적 ㄱㄴ
}

class FoodPoll (val name: String) {
    companion object {
        var total = 0
    }
    var count = 0

    fun vote(){
        total++
        count++
    }
}