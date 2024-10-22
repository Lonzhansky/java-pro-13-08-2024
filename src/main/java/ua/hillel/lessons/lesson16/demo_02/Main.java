package ua.hillel.lessons.lesson16.demo_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    static Calculator calculator;
    static double res;
    static double a;
    static double b;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

//        a = 5;
//        b = 2;
//
//        calculator = new Calculator() {
//            @Override
//            public double sum(double a, double b) {
//                return a + b;
//            }
//        };
//
////        calculator = (a, b) -> a + b;
//
////        calculator = Double::sum;
//
//        res = calculator.sum(a, b);
//
//
//        System.out.println(res);

//        Runnable myRunnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Виконання коду в анонімному класі");
//            }
//        };
//
//        myRunnable.run();

//        Runnable myRunnable = () -> System.out.println("Виконання коду в лямбда-виразі");
//        myRunnable.run();

//        Demo1 demo1 = new Demo1() {
//            @Override
//            public void print(String str) {
//                System.out.println(str);
//            }
//        };
//        Demo1 demo1 = str -> System.out.println(str);
//
//
//        demo1.print("Hello");


//        Calculator calculator1 = (x, y) -> x + y;
//        Calculator calculator1 = (x, y) -> {
//            System.out.println(x);
//            System.out.println(y);
//            return x + y;
//        };
//
//        System.out.println(calculator1.sum(1, 2));


//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("apple", 11);
//        map.put("banana", 22);
//        map.put("potato", 1);



//        map.forEach((key, value) -> {
//            if (value < min) {
//                min = value;
//            }
//        });
//
//        System.out.println(min);


        // Приклад використання посилання на метод для методу println
//        List<String> words = Arrays.asList("apple", "orange", "banana", "grape");

//        for (String word : words) {
//            System.out.println(word);
//        }

//        words.forEach(value -> System.out.println(value));

//        words.forEach(System.out::println);

//        words.sort(String::compareToIgnoreCase);



        // VERSION 1
//        IPrint print = new IPrint() {
//            @Override
//            public void display(String str) {
//                new DemoRefClass(str);
//            }
//        };
//
//        print.display("HELLO!!!");


        // VERSION 2
//        IPrint print = str -> new DemoRefClass(str);
//        print.display("HELLO!!!");

        // VERSION 2
        IPrint print = DemoRefClass::new;
        print.display("HELLO!!!");

    }

}
