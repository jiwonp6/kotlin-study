package ch06_null_safety

data class UserProfile(val name: String?, val email: String?)

fun printUserProfile(profile: UserProfile) {
    val userName = profile.name ?: "이름없음"
    val userEmail = profile.email ?: "이메일 정보 없음"

    println("이름: ${userName}")
    println("이메일: ${userEmail}")

    // java의 isNull 과 isEmpty 를 합친 메소드
    userName.isNullOrEmpty()
}
fun main() {
    val userProfile = UserProfile("홍길동", null)
    printUserProfile(userProfile)
}