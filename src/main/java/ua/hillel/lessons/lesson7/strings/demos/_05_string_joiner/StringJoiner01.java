package ua.hillel.lessons.lesson7.strings.demos._05_string_joiner;

import java.util.StringJoiner;

// Об’єднання рядків за допомогою розділювача
public class StringJoiner01 {

    public static void main(String[] args) {

        // Передаємо ", " як розділювач
        StringJoiner joiner = new StringJoiner(", ");
        // Додаємо елементи до StringJoiner
        joiner.add("orange");
        joiner.add("apple");
        joiner.add("mango");
        joiner.add("kiwi");
        System.out.println("1) " + joiner);

        // Передаємо " > " як розділювач
        joiner = new StringJoiner(" > ");
        // Додаємо елементи до StringJoiner
        joiner.add("Start");
        joiner.add("Run");
        joiner.add("Stop");
        joiner.add("Exit");
        System.out.println("2) " + joiner);

    }
}
