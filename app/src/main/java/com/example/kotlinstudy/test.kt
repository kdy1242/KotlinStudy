package com.example.kotlinstudy

// 한줄 주석

/*
*  여러줄 주석
*/

// 클래스 이름은 파스칼 표기법(대분자로 시작, ClassName)
// 함수나 변수 이름은 카멜 표기법(첫 단어만 소문자로 시작, functionName)

// var : 값 변경 가능, val : 변경 불가능

fun main() {

    // 변수와 자료형

//    // 코틀린은 기본 변수에서 null 허용하지 않음.
//    // var a: Int = 123
//    var a: Int? = null  // 자료형 뒤에 뭂음표 붙여서 nullable 변수(null ㄱㄴ)로 선언
//    println(a)
//
//    // 정수형
//    var intValue: Int = 1234            // 10진수
//    var longValue: Long = 1234L         // 10진수
//    var intValueByHex: Int = 0x1af      // 16진수
//    var intValueByBin: Int = 0b10110110 // 2진수
//
//    // 실수형
//    var doubleValue: Double = 123.5
//    var doubleValueWithExp: Double = 123.5e10
//    var floatValue: Float = 123.5f
//
//    // 문자형
//    var charValue: Char = 'a'
//    var koreanCharValue: Char = '가'
//
//    // 논리형
//    var booleanValue: Boolean = true
//
//    // 문자열
//    var stringValue = "one line string test"
//    var multiLineStringValue = """multiline
//    string
//    test
//    """


    // 형변한과 배열
//    var a: Int = 54321
//    var b: Long = a.toLong()    // 명시적 형변환, 암시적 형변환은 지원 x
//
//    var intArr = arrayOf(1, 2, 3, 4, 5)
//    var nullArr = arrayOfNulls<Int>(5)  // null 로 채워진 배열
//    intArr[2] = 8
//    println(intArr[4])


    // 타입추론과 함수
    // 타입 추론 = 변수나 함수들을 선언할 때나 연산이 이루어질때 자료형을 코드에 명시하지 않아도 코틀린이 자동으로 자료형을 추론함
    var a = 1234    // Int
    var b = 1234L   // Long

    var c = 12.45   // Double
    var d = 12.45f  // float

    var e = 0xABCD  // Int
    var f = 0b01010101  // Int

    var g = true    // Boolean
    var h = 'c'     // Char

    // 함수 = 특정한 동작을 하거나 원하는 결과값을 연산하는데 사용
    println(add(5, 6, 7))

}

//fun add(a: Int, b: Int, c: Int): Int {      // 반환값 없으면 반환형 생략가능
//    return a + b + c
//}
// 단일표현식 함수
fun add(a: Int, b: Int, c: Int) = a + b + c     // 반환형의 타입추론 가능