package ch14_data

// sealed: 봉인된, 상속이 가능한 클래스를 만들고 싶지만 외부에서는 상속받지 않는 경우
// 정의된 파일 내부에서만 상속이 가능한 클래스
// 제한된 상속 => 코드의 응집력을 높임

sealed class Transport(val name: String, val speed: Int)

class Car: Transport("아반떼", 30)
class Bus: Transport("타요", 80)
class Bicycle: Transport("따릉이", 15)
object Tank: Transport("탱므", 70)   // 싱글톤 객체도 상속

// when 문에서 모든 가능한 하위 클래스 타입을 컴파일 시점에 체크
fun handleTransport(transport: Transport) {
    when (transport) {
        is Bicycle -> println("${transport.name}이/가 ${transport.speed}속도로 달립니다.")
        is Bike -> println("${transport.name}이/가 ${transport.speed}속도로 달립니다.")
        is Bus -> println("${transport.name}이/가 ${transport.speed}속도로 달립니다.")
        is Car -> println("${transport.name}이/가 ${transport.speed}속도로 달립니다.")
        Tank -> println("${transport.name}이/가 ${transport.speed}속도로 달립니다.")
    }
}

fun main() {
    handleTransport(Car())
}
