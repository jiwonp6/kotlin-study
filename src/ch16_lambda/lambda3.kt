package ch16_lambda


// 고차 함수
// 매개변수로 함수를 입력받음
fun combine(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    // 리턴 타입으로 함수의 결과값을 반환함
    return operation(a, b)
}

fun main() {
    println(combine(2, 3, { x, y -> x + y}))
    // 마지막에 있는 인자가 람다식이면 바깥으로 뺌 (후행람다)
    println(combine(4, 5) { x, y -> x * y})
}