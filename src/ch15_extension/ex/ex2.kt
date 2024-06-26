package ch15_extension.ex

/*
   <Infix 함수 - 나눗셈>
    1. `Int` 클래스에 `divide`라는 이름의 infix 함수를 추가합니다.
    2. 이 함수는 다른 정수 하나를 인자로 받고, 호출한 정수를 인자로 받은 정수로 나눈 결과를 반환합니다. 결과는 정수로 처리합니다.

 */

infix fun Int.divide(other: Int): Double {
    return this / other.toDouble()
}

fun main() {
    val quotient = 10 divide 2
    println(quotient)  // 출력: 5.0
}