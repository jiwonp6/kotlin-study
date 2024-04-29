package ch06_null_safety

import java.io.DataInput

// null 단언 연산자(!!): 해당 변수의 값이 null 이 아니라고 강제로 단언
fun main() {
    val name: String? = "홍길동"
    println(name!!.length)
    // null 이 대입되는 경우 -> NPE 발생
    
    // readLine(): 사용자에게 입력받기
    print("문자열을 입력하세요: ")
    val input: String? = readLine()

    // println("입력한 내용: " + input)

    if (input != null) {
       processInput(input)
    } else {
        println("유효한 입력이 아닙니다.")
    }
}

fun processInput(input: String?) {
    val validInput = input!!    // null 검증이 끝났음을 단언
    println(validInput.length)
}
