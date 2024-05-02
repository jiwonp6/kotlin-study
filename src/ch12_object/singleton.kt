package ch12_object

// 싱글톤 패턴
object Singleton {   // 단 하나의 인스턴스만 존재
    var count = 0
    fun increment() = count++

}

fun main() {
    // Singleton()  // 생정자 호출 불가
    Singleton.increment()
    Singleton.increment()
    println(Singleton.count)
}