package com.example.kotlinstudy

// 제너릭(Generic)
// 클래스나 함수에서 사용하는 자료형을 외부에서 지정할수잇음
// 함수나 클래스를 선언할때 고정적인 자료형 대신 실제 자료형으로 대체되는 타입 패러미터를 받아 사용하는 방법
// 캐스팅연산없이도 자료형 그대로 사용할수잇음

// 타입패러미터의 이름은 클래스 이름과 규칙이 같지만 일반적으로 타입의 이니셜인 T를 사용하는것이 관례
// 여러개의 제너릭을 사용할경우 T의 다음알파벳인 U, V 사용하기도함 <T, U, V>

// 제너릭을 특정한 수퍼클래스를 상속받은 타입으로만 제한하려면 콜론쓰고 수퍼클래스명 명시하기 <T: SuperClass>

// 함수에 제너릭을 선언한경우 일반적인 함수처럼 사용하면 패러미터나 반환형을통해 타입패러미터 자동으로 추론
// 클래스의경우 인스턴스 만들때 타입패러미터 수동으로 지정, 생성자에 제너릭이 사용된경우 지정하지않아도 자동으로 추론됨

fun main() {
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())
}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class B : A() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}

class C : A() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T: A> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}