package ch02_type

// java 에서는 instanceOf 를 통해 어떤 타입인지 체크 가능
// 코틀린에서는 조금 더 안전한 방법 제공
fun main() {
    val obj: Any = "문자열"
    
    // is 연산자: 객체가 특정타입의 인스턴스인지 검사하고 결과를 true/false 로 리턴
    if (obj is String) {
        // is의 검사가 참일 경우 별도로 캐스팅할 필요 X
        // 스마트 캐스팅 Any -> String
        println(obj.startsWith("문"))
        // String 타입에서 쓸 수 있는 메소드, 프로퍼티 등을 사용할 수 있음
    } else {
        // is의 검사가 false 인 경우 캐스팅 X
        // obj.length
    }

    // !is 연산자
    if (obj !is String) {
        // obj.length   -> 문자열로 캐스팅 X
    } else {
        obj.length
    }
    
    // as 연산자: 강제로 타입을 캐스팅
    val num: Any = 12345
    // val numStr = num as String  // int-> String (ClassCastException 발생)
    
    // as? 연산자: 안전한 캐스팅
    val safeNumStr = num as? String
    println("캐스팅 결과: " + safeNumStr)     // null
    // 해당 타입으로 캐스팅 X -> null 리턴

}