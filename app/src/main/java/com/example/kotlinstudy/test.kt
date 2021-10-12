package com.example.kotlinstudy

fun main() {
    // 클래스의 상속
    // 상속  - 이미 존재하는 클래스를 확장하여 새로운 속성이나 함수를 추가한 클래스를 만들어야할때
    // 여러개의 클래스를 만들엇는데 클래스들의 공통점들을 뽑아 코드관리를 편하게 해야할때 사용
    // 속성과 함수를 물려주는쪽-수퍼클래스
    // 받는쪽 - 서브클래스

    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("루이", 1)
    c.introduce()
    c.meow()

}

// open - 클래스가 상속될수있도록 클래스 선언시 붙여주는 키워드
open class Animal (var name:String, val age:Int, var type:String){
    fun introduce(){
        println("저는 ${type} ${name}이고, ${age}살입니다.")
    }
}

// 서브클래스는 수퍼클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없음
// 서브클래스가 생성될때는 반드시 수퍼클래스의 생성자까지 호출되어야함
class Dog(name:String, age:Int) : Animal(name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name:String, age:Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}