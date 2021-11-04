package com.example.kotlinstudy

import kotlinx.coroutines.*

// 코루틴을 통한 비동기 처리
// 여러개의 루틴을 동시에 실행하여 결과를 내고싶다면
// -> 비동기처리를 지원하는 코루틴 사용

// 메인이되는 루틴과 별도로 진행이 가능한 루틴으로 개발자가 루틴의 실행과 종료를 마음대로 제어할수잇는 단위

// 코루틴을 사용할때는 import kotlinx.coroutines.*

// 코루틴은 제어범위및 실행범위를 지정할 수 잇다 - scope (스코프)
// GlobalScope - 프로그램 어디서나 제어, 동작이 가능한 기본 범위
// CoroutineScope - 특정한 목적의 Dispatcher 를 지정하여 제어 및 동작이 가능한 범위

// CoroutineScope 를 만들때 적용가능한 Dispatcher
// Dispatchers.Default - 기본적인 백그라운드 동작
// Dispatchers.IO - I/O에 최적화된 동작
// Dispatchers.Main - 메인(UI) 스레드에서 동작

// launch 나 async 라는 함수를 통해 새로운 코루틴을 생성할수잇다
// 차이점은 반환값이 잇는지의 여부
// launch - 반환값이 없는 Job 객체
// async - 반환값이 있는 Deffered 객체
// 둘다 람다함수의 형태, async 는 마지막 구문의 실행결과가 반환됨

fun main() {

    

}