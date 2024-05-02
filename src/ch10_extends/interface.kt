package ch10_extends

// interface
interface Movable {
    fun move()                          // 본문이 없는 추상 메소드
    fun describe() = "(움직일 수 있음)"     // 본문이 있는 디폴트 메소드
}

// 구현 클래스
class Bike: Movable {
    override fun move() {
        println("자전거로 이동합니다.")
    }
}

class Taxi: Movable {
    override fun move() {
        println("택시를 타고 이동합니다.")
    }

    // 디폴트 메소드 오버라이딩 (필수 X)
    override fun describe(): String {
        return "택시가 질주합니다."
    }
}

fun main() {
    val bike = Bike()
    val taxi = Taxi()

    // 코틀린에서 공통 인터페이스에 대한 추론
    val movableList = listOf <Movable> (bike, taxi)

    for (movable in movableList) {
        movable.move()              // 추상 메소드 호출
        println(movable.describe()) // 디폴트 메소드 호출
    }
}
