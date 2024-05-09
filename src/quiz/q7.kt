package quiz

class Person (var name: String, var age: Int) {
    override fun toString(): String {
        return "${name}님 (${age}세)\n"
    }
}

fun main() {
    val people = listOf(
                        Person("홍길동", 25),
                        Person("김철수", 32),
                        Person("이영희", 28),
                        Person("박지성", 21),
                        Person("최수민", 30)
                        )

    println(people.sortedBy { -it.age })
    println(people.filter{ person: Person -> person.age > 25 })
}