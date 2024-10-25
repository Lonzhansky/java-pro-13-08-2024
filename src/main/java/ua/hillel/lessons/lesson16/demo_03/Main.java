package ua.hillel.lessons.lesson16.demo_03;

import java.util.*;
import java.util.function.*;

public class Main {

//     static String name = "ORANGE";

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(5, 2, 3, 6, 7, 8);
//
//        Consumer<Integer> integerConsumer = value -> System.out.println("value is: " + value);
//
//        for (Integer value : list) {
//            integerConsumer.accept(value);
//        }


//
//        List<String> strings = Arrays.asList("apple", "banana", "potato");
//
//        Consumer<String> stringConsumer1 = value -> System.out.println("Original value: " + value);
//        Consumer<String> stringConsumer2 =
//                stringConsumer1.andThen(value -> System.out.println("Modified to "+ value.toUpperCase() + "\n"));
//
//        for (String value : strings) {
//            stringConsumer2.accept(value);
//        }


//        HashMap<String, Double> map = new HashMap<>();
//        map.put("banana", 22.2);
//        map.put("apple", 33.3);
//        map.put("potato", 55.5);
//
//        BiConsumer<String, Double> biConsumer = (product, price) -> System.out.println("Product: " + product
//        + " , price: " + price);
//
//        for (Map.Entry<String, Double> stringDoubleEntry : map.entrySet()) {
//            biConsumer.accept(stringDoubleEntry.getKey(), stringDoubleEntry.getValue());
//        }


//        Supplier<Double> supplier = Math::random;
//
//        System.out.println(supplier.get());

//        Product product1 = getProduct(Product::new);
//        product1.setName("POTATO");
//
//        Product product = getProduct(() -> new Product("ORANGE"));
//
//        System.out.println(product1.getName());
//        System.out.println(product.getName());


//        Function<String, Integer> function = (str) -> str.length();
//
//        System.out.println(function.apply("orange"));
//        System.out.println(function.apply("orange1"));
//        System.out.println(function.apply("orange11"));

//        Function<String, String> function = (str) -> str.toUpperCase();
//
//        System.out.println(function.apply("orange"));
//        System.out.println(function.apply("potato"));
//        System.out.println(function.apply("banana"));



//        BiFunction<String, Integer, Double> biFunction = (str, num) -> (double) (str.length() * num);
//
//        System.out.println(biFunction.apply("orange", 2));
//        System.out.println(biFunction.apply("potato", 3));
//        System.out.println(biFunction.apply("banana", 4));

//        Predicate<Integer> predicate1 = num -> num % 2 == 0;
//        Predicate<Integer> predicate2 = predicate1.and(num -> num > 10);
//        Predicate<Integer> predicate3 = predicate1.or(num -> num > 10);
//        Predicate<Integer> predicate4 = predicate1.negate();

//        System.out.println(predicate1.test(10));
//        System.out.println(predicate1.test(11));

//        System.out.println(predicate3.test(10));
//        System.out.println(predicate3.test(13));

//        System.out.println(predicate4.test(11));
//
//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        System.out.println("BEFORE: " + list);
//        list.removeIf(num -> num % 2 == 0);
//        System.out.println("AFTER: " + list);

//        UnaryOperator<Integer> unaryOperator = num -> num * num;
//        System.out.println(unaryOperator.apply(5));
//
////        BinaryOperator<Integer> binaryOperator = Integer::sum;
//        BinaryOperator<Integer> binaryOperator = (a, b) -> Integer.sum(a, b);
//        System.out.println(binaryOperator.apply(5, 10));



    }

    public static Product getProduct(Supplier<Product> supplier) {
        return supplier.get();
    }
}
