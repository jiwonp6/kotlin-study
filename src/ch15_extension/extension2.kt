package ch15_extension

// 원래 기존 멤버 함수와 확장함수의 시그니처가 같은 경우
fun Person.nextYearAge(): Int {
    println("확장함수")
    return this.age + 1
}

// 멤버함수가 우선 호출
fun main() {
    val person = Person("홍길동", 30)
    println(person.nextYearAge())
}