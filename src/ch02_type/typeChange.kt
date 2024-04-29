package ch02_type

fun main() {
    // 자료형 변환
    var number: Int = 50
    // 자바의 더 큰 범위로 타입 변환(프로모션) 발생하지 않음
    // 명시적으로 타입 변환 필요
    var bigNumber: Long = number.toLong()
    var byteNumber: Byte = number.toByte()  // 명시적 변환으로 다운 캐스팅
    
    // 문자열로 변경하고 싶은 경우
    val string: String = number.toString()  
    
    // 변환 타입에 맞는 값이 아닐 경우 런타임 Exception 발생
    val name1: String = "홍길동"
    val name2: String = "100"
    val longNumber1: Long = name1.toLong()
    val longNumber2: Long = name2.toLong()
    println(longNumber1)
    println(longNumber2)


}