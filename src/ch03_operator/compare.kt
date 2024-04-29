package ch03_operator

// Money 클래스, 돈의 양 비교하는 비교 가능 클래스
data class Money(val amount: Int) : Comparable<Money> {
    override fun compareTo(other: Money): Int {
        return this.amount - other.amount
    }
}
fun main() {
    val moneyA = Money(5000)
    val moneyB = Money(10000)

    // 자바에서의 금액 비교: compareTo -> 양수, 0, 음수
    if (moneyA.compareTo(moneyB) == 0) {
        println("금액이 같습니다.")
    } else if (moneyA.compareTo(moneyB) > 0) {
        println("moneyA 금액이 더 큽니다.")
    } else {
        println("moneyB 금액이 더 큽니다.")
    }
    
    // 코틀린에서의 금액 비교: 객체끼리도 비교연산자 사용 가능 (내부적으로는 compareTo 사용)
    if (moneyA == moneyB) {
        println("금액이 같습니다.")
    } else if (moneyA > moneyB) {
        println("moneyA 금액이 더 큽니다.")
    } else {
        println("moneyB 금액이 더 큽니다.")
    }

}