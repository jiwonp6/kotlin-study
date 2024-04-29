package ch08_function

// 함수 선언 (기본 접근제한자: public)
fun maxK1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

// 코틀린에서 if-else 문은 expression
fun maxK2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 함수의 본문이 단일 표현식인 경우 return 생략 가능
fun maxK3(a: Int, b: Int): Int = if (a > b) a else b

// return 타입이 추론 가능한 경우 생략 가능
fun maxK4(a: Int, b: Int) = if (a > b) a else b

fun main() {
    maxK1(1, 2)
    maxK2(3, 4)
    maxK3(5, 6)
    maxK4(7, 8)
}