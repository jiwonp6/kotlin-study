package ch09_class

// 클래스 선언 기본 구조
class className {
    // 프로퍼티 (java의 필드)
    var property: String        // 프로퍼티는 기본적으로 초기화 되어야 함
    
    // 초기화 블록 (java의 생성자)
    init {
        property = "프로퍼티값"
    }
    
    // 메소드
    fun methodName(str: String): String {
        return ""
    }
}

class Person {
    // 프로퍼티 <- 초기값 필수
    var name: String = "이름"
    var age: Int = 0
    
    // 메소드
    fun greet() {
        println("안녕하세요, 저는 ${name}이고, ${age}세 입니다.")
    }
}

fun main() {
    // 인스턴스 생성
    val person = Person()

    // 내부적으로 getter 호출
    println(person.name)    
    
    // 내부적으로 setter 호출
    person.name = "홍길동"
    person.age = 30

    person.greet()
}