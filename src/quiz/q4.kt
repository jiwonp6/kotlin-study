package quiz

fun main() {
    for (number in 1 ..10) {
        print("${number} ")
    }
    println()
    for (number in 10 downTo 1) {
        print("${number} ")
    }
    println()
    for (number in 1..20 step 2) {
        print("${number} ")
    }
    println()
}