package com.example.kotlinstudy

// 한줄 주석

/*
*  여러줄 주석
*/

// 클래스 이름은 파스칼 표기법(대분자로 시작, ClassName)
// 함수나 변수 이름은 카멜 표기법(첫 단어만 소문자로 시작, functionName)

// var : 값 변경 가능, val : 변경 불가능

fun main() {
    // 코틀린은 기본 변수에서 null 허용하지 않음.
    // var a: Int = 123
    var a: Int? = null  // 자료형 뒤에 뭂음표 붙여서 nullable 변수(null ㄱㄴ)로 선언
    println(a)

    // 정수형
    var intValue: Int = 1234            // 10진수
    var longValue: Long = 1234L         // 10진수
    var intValueByHex: Int = 0x1af      // 16진수
    var intValueByBin: Int = 0b10110110 // 2진수

    // 실수형
    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10
    var floatValue: Float = 123.5f

    // 문자형
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'

    // 논리형
    var booleanValue: Boolean = true

    // 문자열
    var stringValue = "one line string test"
    var multiLineStringValue = """multiline
    string
    test
    """

}
