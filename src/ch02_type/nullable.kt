package ch02_type

fun main() {
    /* null 가능성 */
    // 코틀린의 변수는 기본적으로 null 허용 X
    // -> NPE 방지 (코틀린 설계 목표 중 하나)

    // 1. 일반 변수에는 null X
    var number = 3000L
    // number = null

    // 2. null 가능한 타입으로 명시
    // 명시 방법- > 타입?
    var numberNullable: Long? = 3000L
    numberNullable = null
}