package quiz
class User {
    lateinit var username: String

    fun initUsername(username: String) {
        this.username = username
    }

    val welcomeMessage: String by lazy {
        println("환영합니다, ${username}님!")
        "지연초기화"
    }

}
fun main() {
    val user = User()
    user.initUsername("홍길동")
    user.welcomeMessage
}
