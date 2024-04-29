package ch03_operator

fun main() {
    val a = 10
    val b = 20

    /* 산술연산자 */
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    /* 비교연산자 */
    println(a == b)
    println(a != b)
    println(a > b)
    println(a >= b)
    println(a < b)
    println(a <= b)
    
    /* 논리연산자 (&&, ||, !) */

    /* 객체의 동등성(Equality)과 동일성(Identity) 비교 */
    // 동등성(Equality): 두 객체가 값이 같은 경우
    // 동일성(Identity): 두 객체가 완전히 동일한 객체, 참조 주소가 같은 경우

    // Java 에서 동등성 비교 equals(), 동일성 비교 ==
    // Kotlin 에서 동등성 비교 == 연산자 사용 -> 내부적으로 equals 기능 안전하게 수행,
                // 동일성 비교 === 연산자 사용 -> 자바의 == 연산과 동일한 기능(참조 값 비교)

    val str1 = String ("홍길동".toCharArray())     // String 생성자로 객체 생성
    val str2 = String ("홍길동".toCharArray())

    val isEqual = str1 == str2  // 동등 비교
    val isSame = str1 === str2  // 동일 비교
    println("동등 비교 결과: " + isEqual)     // true
    println("동일 비교 결과: " + isSame)      // false (참조값 주소가 서로 다름)
    
    
}