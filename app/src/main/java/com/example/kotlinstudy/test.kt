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
// async - 반환값이 있는 Deferred 객체
// 둘다 람다함수의 형태, async 는 마지막 구문의 실행결과가 반환됨

// 코루틴은 제어되는 스코프 또는 프로그램 전체가 종료되면 함께 종료됨
// -> 코루틴이 끝까지 실행되는 것을 보장하려면 일정한 범위에서 코루틴이 모두 실행될때까지 잠시 기다려주어야함
// --> runBlocking 블록을 만들어주고 이 안에서 launch{}나 async{}를 직접 생성하면
//      코루틴이 종료될때까지 메인 루틴을 잠시 대기시켜준다
// *주의할점 - 안드로이드에서는 메인 스레드에서 runBlocking 을 걸어주면
//             일정시간동안 응답이 없는경우 ANR(Application Not Responding: 응답없음오류)발생하며 앱이 강제종료됨

// 루틴의 대기를 위한 추가적인 함수들
// delay() - millisecond 단위로 루틴을 잠시 대기시키는 함수
// join() - Job 객체에서 호출하여 Job 의 실행이 끝날때까지 대기하는 함수
// await() - Deferred 객체에서 호출하여 Deferred 의 실행이 끝날때까지 대기하는 함수, deferred 의 결과도 반환함
// 세 함수들은 코루틴 내부 또는 runBlocking{}과 같은 루틴의 대기가 가능한 구문 안에서만 동작 가능

// cancel() - 코루틴 실행 도중에 중단
// 코루틴에 cancel()을 걸어주면 두가지 조건이 발생하며 코루틴을 중단시킬 수 잇다
// 1. 코루틴 내부 delay()함수 또는 yield()함수가 사용된 위치까지 수행된 뒤 종료됨
// 2. cancel()로 인해 속성인 isActive 가 false 가 되므로 이를 확인하여 수동으로 종료함

// withTimeoutOrNull() - 제한시간내에 수행되면 결과값, 아닌경우 null 반환
// 괄호안에 밀리세컨드단위의 타임아웃 시간을 정해두고 중괄호안에 코루틴 구문들을 만든후 결과값을 받는 형태로 사용
// 이거도 join()이나 await()처럼 blocking 함수임

fun main() {

    runBlocking {
        var result = withTimeoutOrNull(50) {
            for(i in 1..10) {
                println(i)
                delay(10)
            }
            "Finish"
        }
        println(result)
    }
}