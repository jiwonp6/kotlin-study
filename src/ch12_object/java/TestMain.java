package ch12_object.java;

public class TestMain {
    public static void main(String[] args) {
        // static 필드는 모든 같은 클래스의 모든 객체가 공유
        CounterJava c1 = new CounterJava();
        System.out.println(c1.count);

        CounterJava c2 = new CounterJava();
        System.out.println(c2.count);
        System.out.println(c1.count);

        System.out.println(MathUtilJava.add(1, 2));

    }
}
