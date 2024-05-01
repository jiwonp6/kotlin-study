package ch05_control.ex
/*
    <주문 처리 시스템>
    간단한 주문 처리 시스템을 구현합니다.
    고객이 주문한 상품의 목록과 가격이 주어지며, 주문의 총액을 계산하고 할인 조건에 따라 최종 금액을 출력합니다.

    요구사항:
    1. 상품명과 가격이 주어진 `Map`에서 주문을 처리합니다. 상품명은 문자열, 가격은 정수입니다.
    2. 주어진 `orders` 리스트에는 고객이 주문한 상품의 이름이 들어 있습니다.
    3. 주문 총액이 50,000원 이상일 경우 10% 할인을 적용합니다.
    4. 모든 계산이 끝난 후, 주문 총액과 할인이 적용된 최종 금액을 출력합니다.

    주어진 데이터:
    - 상품 정보: `Map<String, Int>` 형태로 `{"Coffee" to 5000, "Cake" to 20000, "Tea" to 3000}`
    - 주문 리스트: `listOf("Coffee", "Cake", "Coffee", "Cake", "Cake")`

    실행 예시:
    ```
    주문 총액: 75000원
    할인 적용 후 최종 금액: 67500원
    ```
 */
fun main() {
    var products = mapOf("Coffee" to 5000, "Cake" to 20000, "Tea" to 3000)
    var orders = listOf("Coffee", "Cake", "Coffee", "Cake", "Tea")
    var sum = 0
    var finalPrice = 0.0

    for (product in products) {
        for (order in orders) {
            if (order == product.key) {
                sum += product.value
            }
        }
    }

    if (sum >= 50000) {
        finalPrice = sum * 0.9
    }

    println("주문총액: ${sum}원")
    println("할인 적용 후 최종 금액: ${finalPrice.toInt()}원")

}