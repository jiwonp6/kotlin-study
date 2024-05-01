package ch08_function

// 커스텀(사용자 정의) getter / setter
class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = width == height
    // 프로퍼티 하단부에 getter 와 setter 를 커스터마이징 하는 블록 생성 가능
    
    // 정사각형의 너비를 계산하는 프로퍼티
    var area: Int
        get() = width * height
        set(value) {
            // 정사각형임을 간주하고 너비로 길이와 높이를 구한다.
            width = Math.sqrt(value.toDouble()).toInt()
            height = width
        }
}

fun main() {
    val rectangle1 = Rectangle(10, 10)
    val rectangle2 = Rectangle(10, 5)

    // 필드에 접근할 때 getter 가 호출 => 커스텀 게터의 수식이 실행되어 반환
    println("정사각형 여부: ${rectangle1.isSquare}, 사각형의 넓이: ${rectangle1.area}")
    println("정사각형 여부: ${rectangle2.isSquare}, 사각형의 넓이: ${rectangle2.area}")

    // area 의 커스텀 세터가 호출
    rectangle1.area = 49
    println("변경된 길이: ${rectangle1.width}, 변경된 높이: ${rectangle1.height}")
}