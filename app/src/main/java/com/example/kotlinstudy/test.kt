package com.example.kotlinstudy

// 변수의 고급 기술
// 늦은 초기화

// lateinit - 일단 변수만 선언하고 초기값의 할당은 나중에 할수 잇도록 하는 키워드 (var 앞에 써주기)

// lateinit var 변수의 제한사항
// 초기값 할당 전까지 변수를 사용할 수 없음 (에러 발생)
// 기본 자료형에는 사용할 수 없음 (String 클래스에는 사용 가능)

// lateinit 변수의 초기화를 하였는지 여부를 확인할때는 ::변수이름.isInitialized

fun main() {

    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())

}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        }
        else {
            return "기본값"
        }
    }
}