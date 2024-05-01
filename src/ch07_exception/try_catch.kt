package ch07_exception

// 자바와 동일한 방식의 예외처리 try-catch-finally
fun main() {
    try {
        // 위험한 코드
        val numbers = listOf(1, 2, 3)
        numbers[10]
        // 타입 선언 순서 => 코틀린 방식
    } catch (e: IndexOutOfBoundsException) {
        // 예외 처리
        println(e.message)
        // 예외 발생시키기
        throw Exception("예외 발생")
    } finally {
        println("반드시 실행")
    }
}