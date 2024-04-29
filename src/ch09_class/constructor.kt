package ch09_class

// 생성자
// 주 생성자 (Primary Constructor)
class Person2 constructor(name: String, age: Int) {
    val name = name
    val age = age
}

// constructor 키워드 생략 가능
class Person3 (name: String, age: Int) {
    val name = name
    val age = age
}

// 클래스 프로퍼티 선언과 생성을 동시에
class Person4 (val name: String, val age: Int)

// 주 생성자에서 초기화 시 로직이 필요한 경우
class Person5 (val name: String, val age: Int) {
    // 초기화 블록
    init {
        println("사람 객체($name, $age)를 생성하였습니다.")
    }
}

// 코틀린에서 생성자를 여러 개 만들 경우
class Person6 (val name: String, val age: Int) {
    // 부 생성자
    constructor(name: String): this(name, 0) {
        // 부 생성자는 주 생성자를 보완하는 역할 -> 주 생성자 호출 필요
    }
    
    // 부 생성자는 하나 이상 정의 가능
    constructor(): this("무명", 0)
}

// 부생성자에서 기본값만 주는 경우 -> default parameter 가 훨씬 간결 
class Person7 (val name: String = "무명", val age: Int = 0)