package ch15_extension

// 확장함수
fun Int.addExt(other: Int): Int {
    return this + other
}

// 중위함수
infix fun Int.add(other: Int): Int {
    return this + other
}

fun main() {
    // 확장함수 사용
    println(1.addExt(2))

    // 중위함수 사용
    println(3 add 4)

}
