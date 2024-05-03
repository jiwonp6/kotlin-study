package ch15_extension

// 지역함수
fun main() {
    val name = "코틀린"

    fun kotlinFun() {       // 지역함수 사용 O
        println("안녕하세요 ${name}")
    }

    kotlinFun()             // 정의된 내부에서 호출 가능
}

// kotlinFun() // 정의된 함수 외부에서는 사용 X