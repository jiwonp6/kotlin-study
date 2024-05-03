package ch16_lambda

// 고차함수: return 타입으로 함수를 반환하는 고차함수
fun getOperation(operator: String): (Int, Int) -> Int {
    return when (operator) {
        "add", "더하기", "+" -> {a, b -> a + b}
        "sub", "빼기", "-" -> {a, b -> a - b}
        "mul", "곱하기", "*" -> {a, b -> a * b}
        "div", "나누기", "/" -> {a, b -> a / b}
        else -> {_, _ -> 0}
    }
}

fun main() {
    // 반환 값으로 받은 함수를 매개변수를 붙여 호출
    println(getOperation("add")(10, 20))
    println(getOperation("sub")(30, 20))
    println(getOperation("mul")(4, 5))
    println(getOperation("div")(30, 10))

    // 코드 및 함수 재사용 가능
    val subFunc = getOperation("곱하기")
    println(subFunc(30, 15))
    println(subFunc(100, 500))

    // 람다 호출 방법
    val divFunc = getOperation("나누기")
    println(divFunc.invoke(10, 5))
    
}