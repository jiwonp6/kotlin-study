package ch03_operator

fun main() {
    // 범위 연산자: a..b
    val numberRange = 1..10     // 1 부터 10 까지의 범위 생성
    
    // in 연산자: 컬렉션이나 범위에 특정 값이 있는지 확인
    if (5 in numberRange) {
        println("범위 내에 값 5가 존재합니다.")
    } else if (12 in numberRange) {
        println("범위 내에 값 12가 존재하지 않습니다.")
    }

    // !in 연산자: 특정 범위 내에 값이 없는지 확인
    if (12 !in numberRange) {
        println("범위 내에 값 12가 존재하지 않습니다.")
    }

    // 인덱싱 연산자: variable[i], 문자열과 같은 순서범위에서 특정 인덱스 위치를 가져옴
    var name = "홍길동"
    // 자바에서는 name.charAt(0)
    println(name[0])    // 홍
    println(name[1])    // 길
    println(name[2])    // 동

    var names = listOf("홍길동", "전우치", "임꺽정")     // 컬렉션의 경우
    println(names[1])   // 전우치

    // 인덱싱한 값을 변경하기
    var mutableNames = mutableListOf("홍길동", "전우치", "임꺽정")
    mutableNames[0] = "김길동"
    println(mutableNames[0])    // 김길동
    
}