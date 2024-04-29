package ch08_function

// vararg: 가변인자, 같은 타입의 매개변수를 한 번에 받기
fun printNumbers(vararg numbers: Int) {
    // 같은 배열로 인자를 받음
    for (number in numbers) {
        print("${number} ")
    }
    println()
}
fun printNumbersWithSuffix(vararg numbers: Int, suffix: String) {
    // 같은 배열로 인자를 받음
    for (number in numbers) {
        print("${number}${suffix} ")
    }
    println()
}

fun main() {
    // 인자로 0개 이상의 값을 입력 받을 수 있음
    printNumbers(1, 5, 8, 4, 5, 2, 5, 6, 1, 78, 5)
    printNumbers(10)

    // 가변인자는 매개변수 어디에나 올 수 있지만,
    // 가변인자 뒤에 다른 매개변수가 있으면 반드시 매개변수 이름을 지정하여 호출해야 함
    printNumbersWithSuffix(1, 5, 8, 7, suffix = "개")
    
    // 가변인자를 배열로 전달 -> 스프레드 연산자(*) 이용
    val ints = intArrayOf(7, 8, 9)
    printNumbers(*ints)
    printNumbersWithSuffix(*ints, suffix = "자루")
}