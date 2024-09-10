package ua.hillel.lessons.lesson7.strings.demos._05_string_joiner;

import java.util.StringJoiner;

// Можна об’єднати два з’єднувачі за допомогою merge(),
// який додає вміст заданого StringJoiner без префікса
// та суфікса як наступний елемент.
public class StringJoiner03 {

    private final static String PREFIX = "[";
    private final static String SUFFIX = "]";

    public static void main(String[] args) {
        // Створюємо з'єднувач з роздільником ", ",
        // суфіксом та префіксом
        StringJoiner fruitsJoiner =
                new StringJoiner(", ", PREFIX, SUFFIX);
        // Додаємо елементи до StringJoiner
        fruitsJoiner.add("orange")
                .add("mango")
                .add("plum");

        // Створюємо з'єднувач з роздільником "-",
        // суфіксом та префіксом
        StringJoiner vegesJoiner =
                new StringJoiner("-", PREFIX, SUFFIX);
        // Додаємо елементи до StringJoiner
        vegesJoiner.add("potato")
                .add("carrot")
                .add("tomato");

        // Об'єднуємо всі елементи
        StringJoiner mergedJoiner = fruitsJoiner.merge(vegesJoiner);

        System.out.println("RESULT: " + mergedJoiner);
    }
}
