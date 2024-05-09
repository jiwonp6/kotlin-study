package quiz

fun main() {
    printEmail("abc@abc.com")
    printEmail(null)
}

fun printEmail(email: String?) {
    email?.let {
        if (!it.isNullOrEmpty()){
            println("입력된 이메일: $it")
        }
    } ?: run {
        println("이메일이 입력되지 않았습니다.")
    }
}
