package ch15_extension

fun registerUser(name: String, age: Int) {
    // 유효성 검증 로직
    fun validateInput(input: String) {
        if (input.isNullOrEmpty()) {
            throw IllegalArgumentException("유효한 입력이 아닙니다.")
        }
        if (input.length > 100) {
            throw IllegalArgumentException("너무 긴 이름입니다.")
        }
    }
    
    validateInput(name)     // 이름에 대한 유효성 검사

    if (age < 18) {
        throw IllegalArgumentException("미성년자는 가입할 수 없습니다.")
    }
    
    println("회원이 가입되었습니다: ${name}, ${age} 세")
}
fun main() {
    registerUser("홍길동", 30)
    registerUser("전우치", 15)

    // validateInput(  )    <-  지역함수 사용 X
}