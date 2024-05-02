package ch10_extends

// 추상 클래스: open 키워드가 없어도 상속 가능
abstract class Vehicle {
    // 추상 메소드
    abstract fun drive(): String
}

class Car: Vehicle() {
    override fun drive(): String {
        return "차를 운전합니다."
    }
}

class Truck: Vehicle() {
    override fun drive(): String {
        return "트럭을 운전합니다."
    }
}

fun main() {
    val car = Car()
    val truck = Truck()

    println(car.drive())
    println(truck.drive())

}
