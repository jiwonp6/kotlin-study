## null 안전성
-  코틀린의 변수는 기본적으로 null을 허용하지 않는다.
    -  잠재적인 NPE 문제에 대해서 안전성을 갖춤.
1. nullable(Type?) null값이 필요한 경우 명시적으로 선언
2. safe Call(?.)  null값이 포함될 수 있는 속성이나 함수는 안전 호출
3. elvis operator(?:) null값이 감지될 경우 어떻게 할지 선언
4. 단언 연산자(!!)  강제로 null 안전하다고 선언 