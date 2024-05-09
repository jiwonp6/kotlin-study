package quiz

fun main() {
    println("입력값: ")
    var number: Int? = readLine()?.toInt()

    if (number != null) {
        when {
            (number > 0) -> println("결과: 양수")
            (number == 0) -> println("결과: 영")
            (number < 0) -> println("결과: 음수")
        }
    }
}