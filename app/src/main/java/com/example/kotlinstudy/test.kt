package com.example.kotlinstudy

// 변수의 고급 기술
// var - 한번 할당한 객체가 있더라도 다른 객체로 변경하여 할당할수 잇다
// val - 한번 객체를 할당하면 다시 할당된 객체를 변경할수 없다
// val 은 할당된 객체를 바꿀 수 없을 뿐이지 객체 내부의 속성은 변경할수 잇다

// 상수(constants) - 컴파일 시점에 결정되어 절대 바꿀 수 없는 값
// const val 으로 선언
// 상수로 선언될수잇는값은 기본 자료형만 ㄱㄴ (String 포함)
// 런타임에 생성될수있는 일반적인 다른 클래스의 객체들은 담을 수 없다
// 상수는 클래스의 속성이나 지역변수로는 사용할수 없음
// 반드시 companion object 안에 선언하여 객체의 생성과 관계없이 클래스와 관계된 고정적인 값으로만 사용하게된다

// 상수의 이름을 만들때는 의례적으로 대문자와 언더바만 사용함

// 변수의경우 런타임시 객체를 생성하는데 시간이 더 소요되어 성능에 하락이 있기때문에
// 늘 고정적으로 사용할 값은 상수를 통해 객체의 생성없이 메모리에 값을 고정하여 사용함으로서 성능을 향상시킬수잇다는 장점이 잇다

fun main() {
    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when(foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}원입니다")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}