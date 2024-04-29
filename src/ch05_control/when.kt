package ch05_control

fun main() {
    // when: Java 의 switch-case 문에 대응
    // switch-case 문보다 유연하게 복잡한 표현식 사용 가능
    val number = 2

    when (number) {
        1 -> println("1번 메뉴입니다.")
        2 -> println("2번 메뉴입니다.")
        3 -> println("3번 메뉴입니다.")
        else -> println("잘못된 번호입니다.")
    }

    // 범위
    val score = 70

    when (score) {      // 범위를 조건으로 사용 가능
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    val grade1 = when (score) {      // when 조건문의 결과(분기)도 표현식으로 변수나 리턴값에 대입 가능
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("${score}점, ${grade1}학점입니다.")

    val grade2 = when {      // 특정 변수가 아닌 외부 조건 표현식 검사에도 사용 가능
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else -> "D"
    }
    
    fun getUserRole(userType: Int): String {
        return when (userType) {    // return 값으로 사용 가능
            1 -> "관리자"
            2, 3 -> "스태프"
            4 -> "회원"
            else -> "비회원"
        }
    }

    val userType = 1
    println("상태: " + getUserRole(userType))



}