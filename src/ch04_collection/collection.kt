package ch04_collection

fun main() {
    // List, Set, Map
    // 컬렉션은 불변(Immutable) 컬렉션/가변(Mutable) 컬렉션으로 구분

    // 1. List
    /* 불변 컬렉션: 읽기는 가능, 수정은 불가능 */
    val immutableList = listOf("사과", "바나나", "오렌지")
    println(immutableList[1])
    // immutableList.add("복숭아") 수정 불가

    /* 가변 컬렉션: 읽기 가능, 수정 가능 */
    val mutableList = mutableListOf("사과", "바나나", "오렌지")
    println(mutableList[1])
    mutableList.add("복숭아")
    println(mutableList)

    // 2. Set: 중복 X
    val immutableSet = setOf("가", "나", "다")
    println(immutableSet)

    val mutableSet = mutableSetOf("가", "나", "다")
    mutableSet.add("라")
    println(mutableSet)

    // 3. Map
    val immutableMap = mapOf(1 to "홍길동", 2 to "전우치", 3 to "임꺽정")
    println(immutableMap)

    val mutableMap = mutableMapOf(1 to "홍길동", 2 to "전우치", 3 to "임꺽정")
    mutableMap.put(4, "심청이")
    mutableMap[5] = "김콩쥐"
    println(mutableMap)


}