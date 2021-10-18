package com.example.kotlinstudy

// 람다함수
// 람다함수는 고차함수와 달리 그 자체가 고차함수기때문에 별도의 연산자 없이도
// 변수에 담을 수 있다

fun main() {
    b(::a)

    val c: (String)->Unit = {str -> println("$str 람다함수")}
    b(c)
}

fun a (str: String) {
    println("$str 함수 a")
}
fun b (function: (String)->Unit){ // 함수의 형식은 자료형으로 나타내려면 (패러미터) -> 반환형
    // Unit - 값이 없다
    function("b가 호출한")
}
// 고차함수와 람다함수를 사용하면 이렇게 함수를 일종의 변수로 사용할수있다는 편의성도 있지만
// 이후 배우게될 컬렉션의 조작이나 스코프 함수의 사용에도 도움이 된다