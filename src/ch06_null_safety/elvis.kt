package ch06_null_safety

// 엘비스 연산자('?:'): null 감지될 경우 어떻게 처리할지 선언
fun main() {
    val name: String? = null
    val safeName = name ?: "이름 없음"
    println(safeName)

    val str: String? = "abcdefg"
    println("문자열의 길이: " + str?.length ?: 0)

    // 함수 리턴값으로 활용
    fun getLength(str: String?): Int {
        return str?.length ?: 0
    }

    // null 일 경우 예외 발생시키기
    val input: String? = null
    println(input ?: throw IllegalArgumentException("null 입력 불가"))
}