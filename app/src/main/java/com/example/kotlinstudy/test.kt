package com.example.kotlinstudy

// 익명객체와 옵저버 패턴

// 이벤트가 일어나는것을 감시하는 감시자 역할(키의 입력, 터치의 발생, 데이터 수신 등)
// 이벤트 - 함수로 직접 요청하지 않았지만 시스템 또는 루틴에 의해서 발생하는 동작
// 옵저버 패턴 - 이벤트가 발생할때마다 즉각적으로 처리할수있도록 만드는 프로그래밍 패턴

// 옵저버 패턴 구현할땐 두개의 클래스 필요함
// 1. 이벤트 수신하는 클래스
// 2. 이벤트의 발생 및 전달하는 클래스

// 2에서 이벤트가 발생할때 1에있는 이벤트 처리하는 함수를 호출
// 하지만 1은 2를 참조할수있지만 2는 1을 참조할방법이 없음 -> 인터페이스로 해결
// 이때 인터페이스를 observer(코틀린에서는 listener), 이벤트를 넘겨주는 행위는 callback

fun main() {
    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter(var listener: EventListener) {
    fun count() {
        for(i in 1..100) {
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start() {
        val counter = Counter(this)
        // this - EventPrinter 객체 자신을 나타내지만 받는쪽에서 EventListener 만 요구했기 때문에 EventListener 구현부만 넘겨주게됨
        counter.count()
    }
}