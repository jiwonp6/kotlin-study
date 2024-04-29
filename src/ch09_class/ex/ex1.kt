package ch09_class.ex

/*
    <은행 계좌 클래스 만들기>
    - BankAccount 클래스를 만듭니다.
    - 계좌 잔액(balance)을 나타내는 프로퍼티를 포함하세요. 초기 잔액은 0으로 설정합니다.
    - 입금(deposit)과 출금(withdraw) 메서드를 구현합니다. 출금 시 잔액보다 많은 금액을 출금하려고 하면 오류 메시지를 출력합니다.
    - 계좌의 현재 잔액을 반환하는 메서드 getBalance()를 만드세요.
    - 메인 메서드에서 계좌 인스턴스를 생성하고 메서드를 호출해서 각 상황마다 테스트하세요.
 */
class BankAccount(var bal: Int = 0) {

    fun getBalance(): Int {
        return bal
    }
    fun deposit(money: Int) {
        bal += money
    }
    fun withdraw(money: Int) {
        if (money > bal) println("출금불가") else bal -= money
    }
}
fun main() {
    val bankAccount = BankAccount()
    bankAccount.deposit(10000)
    bankAccount.withdraw(5000)
    println("계좌잔액: " + bankAccount.getBalance())
}