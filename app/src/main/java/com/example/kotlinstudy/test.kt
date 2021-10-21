package com.example.kotlinstudy

// 클래스의 다형성

// 다형성 - 클래스의 상속관계에서 오는 인스턴스의 호환성을 적극 활용할 수 잇는 기능
// 수퍼클래스가 같은 인스턴스를 한번에 관리하거나 인터페이스를 구현하여 사용하는 코드에서도 사용됨- 이해꼭필요

// 업캐스팅 - 상위 자료형으로 변환
// 다운캐스팅 - 하위자료형으로 변환

// 업캐스팅은 상위 자료형에 담는것으로 동작, 다운캐스팅은 별도의 연산자가 필요함 -> as, is
// as - 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자, 코드 내에서 사용할시 즉시 자료형을 변환해줌 / 변환된 자료형을 반환도 해줌
// is - 변수가 자료형에 호환되는지를 먼저 체크한후 변환해주는 캐스팅 연산자, 조건문 내에서 사용됨

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    if(b is Cola) { // is는 조건문 안에서만 잠시 다운캐스팅됨
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    b.washDishes()  // as를 사용하면 반환값뿐만아니라 변수 자체도 다운캐스팅되기 때문에 에러 ㄴㄴ
}

open class Drink {
    var name = "음료"

    open fun drink(){
        println("${name}를 마십니다")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다")
    }
}