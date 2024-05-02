package ch10_extends

open class Animal {
    open fun eat() {
        println("동물이 먹습니다.")
    }
}

class Dog: Animal() {       // 상속받은 클래스
    override fun eat() {
        println("개가 먹습니다.")
    }
}

fun main() {
    val dog = Dog()
    dog.eat()
}