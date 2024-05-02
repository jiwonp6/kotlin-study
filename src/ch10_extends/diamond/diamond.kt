package ch10_extends.diamond

abstract class Animal(val name: String)
interface Flyable {
    fun fly()
    fun move() = println("납니다.")
}
interface Swimmable {
    fun swim()
    fun move() = println("헤엄칩니다.")
}

class Duck(name: String): Animal(name), Flyable, Swimmable {
    override fun fly() {
        println("${name}(이/가) 납니다.")
    }

    override fun swim() {
        println("${name}(이/가) 헤엄칩니다.")
    }

    override fun move() {
        // 양쪽 인터페이스의 본문을 가진 메소드 중 구체적인 타입을 선택하여 호출
        super<Flyable>.move()       // Flyable 의 move 를 호출
        super<Swimmable>.move()     // Swimmable 의 move 를 호출
    }

}

fun main() {
    val duck = Duck("오리")
    duck.move()
    duck.fly()
    duck.swim()

}