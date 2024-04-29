package ch01_variable

/*
    * 변수선언
    1. val (Value)
        - java 의 final 키워드와 유사
        - 불변(immutable) 변수, 한 번 초기화하면 값을 변경할 수 없음.
    2. var (Variable)
        - 가변(mutable) 변수
        - 초기화 후에도 값을 변경할 수 있음.
        - 값이 업데이트 되어야 하는 경우에 var 를 사용함.
 */
val numVal = 10
var numVar = 10

fun main() {
    // val 로 선언된 변수에는 값 재할당 불가
    // numVal = 20
    // var 로 선언된 변수에는 값 재할당 가능
    numVar = 20

    // 변수 선언, 초기값 지정 X -> 에러발생
    var strVar1: String
    // println(strVar1)
    var strVar2: String = "초기값"
    println(strVar2)
    var strVar3 = "입니다."
    println(strVar3)

    // Tip! : 모든 변수는 Val 로 우선 선언하고, 값이 변경될 경우에만 var 로 변경한다.


    
    


}