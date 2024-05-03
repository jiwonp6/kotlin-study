package ch15_extension

// 사용자 정의 중위함수 assign: 맵에 페어를 할당
infix fun <K, V> MutableMap<K, V>.assign(pair: Pair<K, V>) {
    this[pair.first] = pair.second
}

fun main() {
    val map = mutableMapOf<String, Int>()
    map.assign("홍길동" to 30)
    map.assign("전우치" to 20)
    // to: 코틀린 표준 라이브러리 정의된 중위 함수
}
