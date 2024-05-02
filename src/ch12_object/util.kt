package ch12_object

class MathUtil private constructor() {  // 객체 생성을 막기 위해 기본 생성자 접근 불가
                                        // 원래는 constructor() 생략되어 있음 -> private 접근 제한자 붙일 때는 생략 X
    // companion object 내부 메서드는 Java 의 static 메소드처럼 사용됨
    companion object {
        fun add(a: Int, b: Int): Int = a + b
    }
}

fun main() {
    println(MathUtil.add(1, 2))
}