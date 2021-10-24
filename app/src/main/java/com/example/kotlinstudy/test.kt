package com.example.kotlinstudy

// 문자열을 다루는 법

fun main() {
    val test1 = "Test.Kotlin.String"

    println(test1.length)   // 문자열의 길이

    println(test1.toLowerCase())    // 영문 소문자로 문자열 전체를 변환하여 반환
    println(test1.toUpperCase())    // 영문 대문자로 문자열 전체를 변환하여 반환

    val test2 = test1.split(".")
    println(test2)   // 특정 문자열을 기준으로 문자열을 여러개로 나눠 배열에 담기

    // 문자열이 들어가있는 배열을 다시 하나의 문자열로 합침
    println(test2.joinToString())
    println(test2.joinToString("-"))

    // 문자열 일부분만 사용
    println(test1.substring(5..10))

    // 문자열이 비어있는지 여부를 판단하여 boolean 값으로 반환
    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    println(nullString.isNullOrEmpty())     // null 이거나 empty 이면 true 반환
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    println(nullString.isNullOrBlank())     // null 이거나 blank 이면 true 반환
    println(emptyString.isNullOrBlank())    // 공백 문자 포함(space, tab, line feed 등등 눈에 직접적으로 보이지 않는 문자)
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))   // 지정한 문자열로 시작하면 true 반환
    println(test4.startsWith("java"))

    println(test3.endsWith(".kt"))      // 지정한 문자열로 끝나면 true 반환
    println(test4.endsWith(".kt"))

    println(test3.contains("lin"))      // 지정한 문자열이 포함되면 true 반환
    println(test4.contains("lin"))
}