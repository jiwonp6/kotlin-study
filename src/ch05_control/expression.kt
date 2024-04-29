package ch05_control

fun main() {
    // if, if-else, if-elseif
    // 기본적으로 자바와 사용법이 같음
    // 차이점) 자바에서 if-else 문은 Statement(명령문) -> 코드 블록 실행하고 흐름 제어, 하나의 값으로 리턴 X
    var age = 20
    if (age > 19) {     // 명령문
        println("성인입니다.")
    }else {
        println("미성년자입니다")
    }

    100 + 200               // 표현식 Expression
    val number = 100 + 200  // 명령문 Statement

    // 코틀린에서 if-else 문은 Expression(표현식) -> 값 반환 O, 다른 변수에 할당하거나 표현식의 일부로 사용 O
    // => 삼항 연산자 없음
    val status = if (age > 19) "성인" else "미성년자"     // 표현식
    println("${status}입니다.")

    // if문 분기에 따라 반환 (Java 방식)
    fun getPassOrFail1(score: Int): String {
        if (score >= 60) {
            return "Pass"
        } else {
            return "Fail"
        }
    }
    println(getPassOrFail1(70))

    // if 표현식을 반환값으로 적용 가능 (코틀린 방식)
    fun getPassOrFail2(score: Int): String {
        return if (score >= 60) {
            "Pass"
        } else {
            "Fail"
        }
    }
    println(getPassOrFail2(70))







}