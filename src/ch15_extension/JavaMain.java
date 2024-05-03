package ch15_extension;

public class JavaMain {
    public static void main(String[] args) {
        // 자바에서 확장함수 호출 시 static 함수처럼 사용 가능
        char lastChar = Extension4Kt.lastChar("홍길동");
        System.out.println("lastChar = " + lastChar);

        // 지역함수 사용 X
        // public void function(String name) { }
    }
}
