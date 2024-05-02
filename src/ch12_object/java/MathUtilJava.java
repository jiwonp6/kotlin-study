package ch12_object.java;

public class MathUtilJava {
    // 객체 생성을 막기 위해 기본 생성자 접근 불가
    private MathUtilJava() {}
    
    public static int add(int a, int b) {
        return a + b;
    }
}
