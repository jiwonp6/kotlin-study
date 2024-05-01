package ch09_class.ex

/*
    <커스텀 게터/세터를 포함한 온도 클래스 만들기>
    - Temperature 클래스를 만드세요.
    - 섭씨 온도(celsius)를 프로퍼티로 저장합니다.
    - 화씨 온도(fahrenheit)를 커스텀 게터로 계산하여 반환하세요.
    - 화씨 온도(fahrenheit)를 커스텀 세터로 섭씨로 변환하여 저장하세요.
    - 현재 온도를 섭씨와 화씨로 표시하는 메서드를 작성하세요.

    - 섭씨 -> 화씨 : celsius * 9 / 5 + 32
    - 화씨 -> 섭씨 : (fahrenheit - 32) * 5 / 9
 */
class Temperature(var celsius: Double) {
    var fahrenheit: Double
        get() = celsius * 9 / 5 + 32
        set(value) {
            (fahrenheit - 32) * 5 / 9
        }
}
fun main() {
    val temperature = Temperature(100.0)

    println("섭씨온도는 ${temperature.celsius}이고, 화씨온도는 ${temperature.fahrenheit}이다.")
}