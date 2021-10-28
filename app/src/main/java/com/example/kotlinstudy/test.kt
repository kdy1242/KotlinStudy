package com.example.kotlinstudy

// Data Class

// 데이터를 다루는데 최적화된 클래스

// 5가지 기능을 내부적으로 자동으로 생성해줌
// equals() - 내용의 동일성을 판단
// hashcode() - 객체의 내용에서 고유한 코드를 생성
// toString() - 포함된 속성을 보기쉽게 나타냄
// copy() - 객체를 복사하여 똑같은 내용의 새 객체를 만듦
// componentX() - 속성을 순서대로 반환

// copy() 로 새 객체를 생성할때는 똑같은 내용의 객체를 생성할수도있지만
// 생성자와 똑같은형태의 패러미터를 주어 일부 속성을 변경해줄수도 잇다

fun main() {
    val list = listOf(Data("보영", 212),
                      Data("루다", 306),
                      Data("아린", 618))

    for((a, b) in list) {   // 내부적으로는 component1(), component2() 라는 함수를 사용하여 순서대로 값을 불러오게됨
        println("${a}, ${b}")
    }
}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)