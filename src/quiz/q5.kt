package quiz

import kotlin.math.pow

fun calculateDistance(x1: Int = 0, y1: Int = 0, x2: Int = 0, y2: Int = 0): Double {
    return kotlin.math.sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2))
}

fun main() {
    print("두 점 사이의 거리 (0, 0) (0, 0): ")
    println(calculateDistance())

    print("두 점 사이의 거리 (3, 4) (0, 0): ")
    println(calculateDistance(3, 4))

    print("두 점 사이의 거리 (0, 0) (5, 5): ")
    println(calculateDistance(x2 = 5, y2 = 5))

    print("두 점 사이의 거리 (10, 0) (0, 10): ")
    println(calculateDistance(10, y2 = 10))
}