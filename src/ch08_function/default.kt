package ch08_function

// default parameter (Java 와 동일하게 오버로딩 방법도 가능)
fun repeat(str: String, num: Int = 3, isNewLine: Boolean = true) {
    for (i in 1..num) {
        if (isNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}
fun main() {
    // 호출 시 입력 파라미터 값을 지정하지 않을 경우, 대입한 값으로 함수 호출
    repeat("안녕하세요", 3, true)
    repeat("문자열만 입력")
    repeat("횟수도 입력", 2)
}
