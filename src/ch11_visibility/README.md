## 가시성(Visibility) 제어
- Java : public, protected, (default), private
- Kotlin : (public), protected, internal, private
- 자바의 기본값은 default, 코틀린의 기본값은 public

- 코틀린
    - public : 모든 곳에서 접근 가능
    - protected : **선언된 클래스** 또는 하위 클래스에서만 접근 가능
                  (파일 최상단에서는 사용 불가능)
    - internal : 같은 **모듈**에서만 접근 가능
    - private : 선언된 클래스에서만 접근가능
                (같은 파일 내에서만 접근 가능)

- 자바
    - public : 모든 곳에서 접근 가능
    - protected : 같은 패키지 또는 하위 클래스에서만 접근 가능
    - default : 같은 패키지에서만 접근 가능
    - private : 선언된 클래스에서만 접근가능
