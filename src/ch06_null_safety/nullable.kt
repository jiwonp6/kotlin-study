package ch06_null_safety

fun main() {
    // non-nullable 타입
    var name: String = "홍길동"
    // name = null  -> null 불가능

    // nullable 타입
    var age: Int? = 30
    age = null
    
    // Safety Call
    // null 값이 포함될 수 있는 속성이나 함수는 Safety Call 을 통해서 호출
    // 안전 호출 연산자 '?.'을 통해서 nullable 에 접근
    var address: String? = "부산"
    println(address?.length)

    address = null
    println(address?.length)    // null 인 경우 안전호툴연산자 뒷부분 수행 X


}