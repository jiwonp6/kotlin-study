package ch14_data.ex
/*
    <Enum 클래스 만들기>

    요구사항 1. 기본 Enum 클래스 만들기
    코틀린에서 `DayOfWeek`라는 이름의 `enum` 클래스를 생성하세요. 이 클래스는 요일을 나타내며,
    각 요일은 `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`로 정의됩니다.

    요구사항 2: Enum 프로퍼티 추가
    앞서 만든 `DayOfWeek` `enum` 클래스에 각 요일이 주말인지 평일인지를 나타내는 `isWeekend` 불리언(boolean) 프로퍼티를 추가하세요.
    `SATURDAY`와 `SUNDAY`는 주말로 `true`를, 나머지 요일은 `false`를 가집니다.

    요구사항 3: Enum 메서드 추가
    `DayOfWeek` 클래스에 `printDayType()` 메소드를 추가하세요.
    이 메소드는 요일이 주말인지 평일인지에 따라 "Weekend" 또는 "Weekday"를 출력합니다.

    요구사항 4: Enum과 When 사용
    `DayOfWeek` enum을 사용하여, 입력받은 `DayOfWeek` 값에 따라 다른 활동을 추천하는 함수 `recommendActivity(day: DayOfWeek)`를 작성하세요.
    예를 들어, `SATURDAY`에는 "산책하기", `SUNDAY`에는 "책 읽기" 등 요일별로 다른 활동을 추천하세요.
 */
enum class DayOfWeek(var isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun printDayType() {
        if (isWeekend) {
            println("Weekend")
        } else {
            println("Weekday")
        }
    }
}
private fun recommendActivity(dayOfWeek: DayOfWeek) {
    when (dayOfWeek) {
        DayOfWeek.MONDAY -> println("영화보기")
        DayOfWeek.TUESDAY -> println("요리하기")
        DayOfWeek.WEDNESDAY -> println("러닝하기")
        DayOfWeek.THURSDAY -> println("드라이브하기")
        DayOfWeek.FRIDAY -> println("수영하기")
        DayOfWeek.SATURDAY -> println("산책하기")
        DayOfWeek.SUNDAY -> println("책 읽기")
    }
}
fun main() {
    val day = DayOfWeek.MONDAY
    day.printDayType()
    recommendActivity(day)
}
