package ch15_extension

fun main() {
    // 문자열의 사용자 정의 함수를 확장
    // => 마지막 글자를 찾는 함수
    // 확장함수 선언 1
    fun String.lastChar(): Char {
        return this[this.length - 1]
    }
    // this 키워드를 통해 실제 클래스 객체의 값에 접근
    // String : 확장하려고 하는 클래스 => 수신객체의 타입
    // this : 수신객체
    
    val name = "홍길동"
    
    // String 에 있는 멤버함수처럼 사용할 수 있음
    println(name.lastChar())
    println("확장함수 마지막 글자".lastChar())

    // 확장함수 선언 2
    // 확장함수에서 기존 멤버 함수 사용 가능
    fun String.reverse(): String {
        return this.reversed()
    }

    println(name.reverse())
    
    
}