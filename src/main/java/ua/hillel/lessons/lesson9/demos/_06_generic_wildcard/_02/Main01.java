package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._02;

import java.util.ArrayList;
import java.util.List;

// Знак підстановки з обмеженням зверху
// (Upper bounded wildcard)
// ? extends SuperType
// Найбільш наочніше пояснення - через колекції
// (тут, List, ArrayList)
public class Main01 {

    public static void main(String[] args) {

        // Використання колекції з типом Integer
        List<Integer> list01 = new ArrayList<>();
        list01.add(12);
        list01.add(24);
        getOutput("1) Result is " + addNums(list01));

        // Використання колекції з типом Double
        List<Double> list02 = new ArrayList<>();
        list02.add(35.0);
        list02.add(25.0);
        getOutput("2) Result is " + addNums(list02));
    }

    // List<? extends Number> означає список об’єктів, які є екземплярами
    // класу Number або його підкласів (наприклад, Integer або Double).
    // Параметр List<? extends Number> list використовує знак підстановки
    // з обмеженням зверху, де Number - верхня межа
    private static Double addNums(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum = sum + n.doubleValue();
        }
        return sum;
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
