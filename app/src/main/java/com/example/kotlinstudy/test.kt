package com.example.kotlinstudy

fun main() {
    // 반복문과 증감연산자
    // 조건형 반복문 : while, do while
    var a = 0
    var b = 0
    var c = 0
    while(a < 5) {
        println(a++)    // 출력결과 : 0 1 2 3 4
        println(++b)    // 출력결과 : 1 2 3 4 5
    }
    do {    // 최초 한 번은 조건없이 do 에서 구문을 실행한 후 while 로 조건을 체크(조건과 관계 없이 반드시 한번 실행)
        println(c++)
    } while (c < 5)
    // 범위형 반복문 : for
    for(i in 0..9 step 3) {    // i가 0부터 9이내에서 동작   // step 3 을 붙여서 3씩 증가
        print(i)
    }
    for(i in 9 downTo 0) {  // 9부터 0까지 감소, step 사용가능
        print(i)
    }
    for(i in 'a'..'e') {    // char 자료형에도 사용 ㄱㄴ
        print(i)
    }
}
