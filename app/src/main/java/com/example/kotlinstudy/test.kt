package com.example.kotlinstudy

// 고차함수

// 고차함수 - 함수를 마치 클래스에서 만들어낸 인스턴스처럼 취급하는 방법
// 함수를 패러미터로 넘겨줄 수도 있고 결과값으로 반환받을 수도 있다
fun main() {
    b(::a)  // 함수 b를 호출하되 함수 a를 패러미터로 넘겨줌
    // 고차함수를 표현할땐 함수 이름 앞에 콜론 두개
}
fun a (str: String) {
    println("$str 함수 a")
}
fun b (function: (String)->Unit){ // 함수의 형식은 자료형으로 나타내려면 (패러미터) -> 반환형
                            // Unit - 값이 없다
    function("b가 호출한")
}