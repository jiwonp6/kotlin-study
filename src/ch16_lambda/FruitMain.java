package ch16_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("사과", 3000),
                new Fruit("복숭아", 4000),
                new Fruit("사과", 5000),
                new Fruit("포도", 6000),
                new Fruit("바나나", 3000)
        );

        // 람다식에서 사용되는 변수는 final(불변)이거나
        // final 에 가까워야 한다. (변경되는 지점이 없어야 한다) <- 제약조건 존재
        String targetFruitName = "사과";
        List<Fruit> filtered = filterFruits(fruits, (fruit -> targetFruitName.equals(fruit.getName())));
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        return fruits.stream().filter(fruitFilter).toList();
    }

}
