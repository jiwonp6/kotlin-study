package ch08_function

// Named Argument: 이름이 있는 매개변수
fun configureServer(host: String, port: Int = 80, protocol: String = "http") {
    println("서버가 ${protocol}://${host}:${port}에서 실행되고 있습니다.")
}
fun main() {
    // 매개변수가 선언된 순서대로 호출
    configureServer("127.0.0.1", 80)
    configureServer("127.0.0.1")

    // protocol 만 변경하고 싶은 경우
    // 이름을 설정하여 기본값과 함께 사용
    // Builder 패턴의 효과 <- 이름 지정하여 함수 정의 변경 없이 순서 자유롭게 호출 가능
    configureServer("127.0.0.1", protocol = "ftp")
}
