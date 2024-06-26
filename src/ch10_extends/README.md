## 상속
- 코틀린에서는 자바와 다르게 상속(extends) 구현(implements) 시 `:` 키워드를 사용
- 코틀린의 모든 클래스는 기본적으로 'final'(상속 불가) 상태
- `open` 키워드 : 상속을 허용하기 위해 사용
- `override` 키워드 : 메서드 오버라이드시 필수적으로 사용
- `abstract` 키워드 : 추상 클래스나, 추상 메서드 선언 시 사용,
  상속받는 클래스나 오버라이딩 되는 메서드에 별도의 open 키워드 불필요
- 컨벤션(관례) : 상속 구현 사용시 ' : ' 콜론 앞에 공백을 두는 관례가 있음 (타입과 구분을 위해)
- 상속을 받을 때 부모 클래스의 생성자를 호출해야 함

## 인터페이스
- 인터페이스는 하나 이상의 추상 메서드를 포함할 수 있음(추상 메서드-본문없는메서드)
- 디폴트 메서드 : 인터페이스에서 메서드가 본문을 가지는 경우
- 코틀린에서는 디폴트 메서드 구현을 포함할 수 있음
- 인터페이스는 다른 인터페이스 상속 가능
- 한 클래스는 여러 인터페이스 상속 가능