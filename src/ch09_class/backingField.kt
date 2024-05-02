package ch09_class

class People (name: String, var age: Int) {
    val name: String = name
        // get() = name.uppercase()
        get() = field.uppercase()       // 무한 루프 방지 backing field 사용
                                        // 프로퍼티(게터 포함) X, 필드 자기 자신을 가리키는 키워드
    

}

fun main() {
    val people = People("Tom", 30)
    people.name     // getter 호출 -> name.uppercase()
                    // name. -> 커스텀 getter 호출       => 무한반복...
    println(people.name)

}