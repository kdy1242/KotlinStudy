package com.example.kotlinstudy

// 중첩클래스와 내부클래스

// 중첩클래스 - 하나의 클래스가 다른 클래스의 기능과 강하게 연관되어잇다는 의미를 전달하기위해 만들어진 형식
// 사용할땐 외부클래스이름.중첩클래스이름

// 내부클래스 - 중첩클래스에 inner 라는 키워드를 붙인 내부클래스는
// 혼자서 객체를 만들수는 없고 외부클래스에 객체가 있어야만 생성과 사용이 가능한 클래스

// 중첩클래스는 형태만 내부에 존재할뿐 실질적으로는 서로 내용을 공유할수없는 별개의 클래스이다
// 내부클래스는 외부클래스 객체 안에서 사용되는 클래스이므로 외부클래스객체의 속성이나 함수를 사용할수 있다

fun main() {
    Outer.Nested().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer {
    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}

// 중첩클래스와 내부클래스는 클래스간에 연계성을 표현하여 코드의 가독성및 작성 편의성이 올라갈수 잇으므로
// 적절한 상황에서 사용하는것이 좋음