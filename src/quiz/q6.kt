package quiz

abstract class Animal {
    var name: String = "name"

    abstract fun sound(): String

    fun move() {
        println("${name}가 움직입니다.")
    }
}

interface Runnable {
    fun run()
}

class Cat: Animal(), Runnable {
    override fun sound(): String {
        return "고양이 ${name}: 야옹"
    }

    override fun run() {
        println("고양이 ${name}가 달립니다.")
    }
}

class Dog: Animal(), Runnable {
    override fun sound():String {
        return "개 ${name}: 멍멍"
    }
    override fun run() {
        println("개 ${name}가 달립니다.")
    }
}

fun main() {
    var cat = Cat()
    var dog = Dog()

    cat.name = "냥냥이"
    println(cat.sound())
    cat.move()
    cat.run()
    
    dog.name = "바둑이"
    println(dog.sound())
    dog.move()
    dog.run()

}