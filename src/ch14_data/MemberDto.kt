package ch14_data

// 기본적으로 프로퍼티(getter + setter)
// equals, hashCode, toString 자동으로 만들어 줌
// 생성자는 선언부
data class MemberDto(val name: String, val age: Int)

fun main() {
    val member1 = MemberDto("홍길동", 30)
    val member2 = MemberDto("전우치", 20)
    val member3 = MemberDto("홍길동", 30)

    // equals()
    println(member1 == member2)     // false
    println(member1 == member3)     // true

    // toString()
    println(member1)

    // hashCode()
    println(member1.hashCode())
    println(member2.hashCode())
    println(member3.hashCode())

    // copy()
    // 프로퍼티를 복사하되, 복사 시, 일부 프로퍼티 값을 변경하는 옵션 제공
    val member1Copy = member1.copy(age = 35)
    println(member1Copy)

    // destructing declaration (구조분해할당)
    // 데이터 클래스의 내부 프로퍼티를 각각의 이름의 변수에 할당
    val (name, age) = member1

    println("${name}은 ${age}세 입니다.")

    // Component functions
    // 데이터 클래스의 각 프로퍼티에 대해 자동으로 생성
    // componentN
    val component1 = member1.component1()       // = member1.name
    val component2 = member1.component2()       // = member1.age
    println(component1)
    println(component2)

}