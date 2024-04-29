package ch08_function.ex

/*
    <성적 계산기>
    학생들의 성적을 입력받아 평균 성적을 계산하는 함수를 작성하세요.
    함수는 가변 인자를 받으며, 입력된 모든 성적의 평균을 반환해야 합니다.

    [요구사항]
    - 함수 이름은 `calculateAverage`로 하세요.
    - 성적은 가변 인자 `vararg`를 사용하여 받으세요.
    - 평균은 소수점 두 자리까지 표시하세요.

    --- 출력예시
    [90, 80, 100, 70]
    평균 성적은 85.00입니다.
 */
fun calculateAverage(vararg scores: Int) {
    var sum: Int = 0
    var avg: Double = 0.0
    var count: Int = scores.size
    for (score in scores) {
        sum += score
        print("$score ")
    }
    println()
    avg = sum / count.toDouble()
    println("평균 성적은 ${avg}입니다.")
}
fun main() {
    calculateAverage(90, 80, 100, 70)

}