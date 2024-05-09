package quiz

fun main() {
    printName("홍길동")
    printName(null)
}

fun printName(s: String?) {
    if (s != null) {
        println("성: " + s?.substring(0, 1) + ", 이름: " + s?.substring(1, s.length))
    } else {
        println("성: 김, 이름: 무명")
    }
}
