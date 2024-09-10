package ua.hillel.lessons.lesson7.strings.demos._05_string_joiner;

import java.util.StringJoiner;

// Об’єднання рядків за допомогою розділювача, додавання
// префікса та суфікса
public class StringJoiner02 {

    private final static String PREFIX = "[";
    private final static String SUFFIX = "]";

    public static void main(String[] args) {

        // Передаємо ", " як розділювач
        StringJoiner joiner =
                new StringJoiner(", ", PREFIX, SUFFIX);
        // Додаємо елементи до StringJoiner
        joiner.add("orange");
        joiner.add("apple");
        joiner.add("mango");
        joiner.add("kiwi");
        System.out.println("1) " + joiner);

        // Передаємо " > " як розділювач
        joiner = new StringJoiner(" > ", PREFIX, SUFFIX);
        // Додаємо елементи до StringJoiner
        joiner.add("Start");
        joiner.add("Run");
        joiner.add("Stop");
        joiner.add("Exit");
        System.out.println("2) " + joiner);

    }
}
