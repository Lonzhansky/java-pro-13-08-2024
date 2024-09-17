package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._02;

import java.util.Arrays;
import java.util.List;

// Необмежений знак підстановки
// (Unbounded wildcard)
// Ніяких обмежень, які можуть встановлюватись
// певною ієрахією класів, немає.
// Найбільш наочніше пояснення - через колекції
// (тут, List, ArrayList)
public class Main03 {

    public static void main(String[] args) {

        // Використання колекції з типом Integer
        List<Integer> list01 = Arrays.asList(9, 12, 7);
        System.out.print("Integer data: ");
        displayData(list01);

        // Використання колекції з типом String,
        // який взагалі не знаходиться в ієрархії класу Number
        List<String> list02 = Arrays.asList("orange", "apple", "grape");
        System.out.print("String data: ");
        displayData(list02);
    }

    // List<?> означає, що список типізовано будь-яким класом
    public static void displayData(List<?> list) {
        System.out.println(list);
    }
}
