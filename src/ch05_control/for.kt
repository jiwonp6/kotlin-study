package ch05_control

// for 문
fun main() {
    // 주로 범위 연산자로 변수값 증감
    var sum = 0
    for (i in 1..10) {          // 마지막 값 포함
        sum += i
    }
    println(sum)

    sum = 0
    for (i in 1 until 10) {     // 마지막 값 미포함
        sum += i
    }
    println(sum)

    // step: 반복의 간격 지정
    sum = 0
    for (i in 2 .. 10 step 2) { // 짝수 합계
        sum += i
    }
    println(sum)

    // downTo: 역순(감소)
    for (i in 10 downTo 1) { // 짝수 합계
        print("${i} ")
    }
    println("")

    // 향상된 for 문
    val list = listOf(10, 20, 30, 40)
    for (i in list) {
        print("${i} ")
    }
    println("")

    // while 문 java와 동일하게 사용 가능
    var i = 1
    while (i <= 10) {
        print("${i} ")
        i++
    }
    println("")

}