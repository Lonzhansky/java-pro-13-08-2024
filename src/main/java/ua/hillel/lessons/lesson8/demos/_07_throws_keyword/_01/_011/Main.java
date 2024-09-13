package ua.hillel.lessons.lesson8.demos._07_throws_keyword._01._011;

import java.io.IOException;

// Оголошуємо виняток, виняток виникає.
// НЕ обробляємо виняток через try-catch.
// Подальший код НЕ буде виконуватись, навіть
// якщо оголошено виняток через throws.
// Тобто, throws не оброблює виняток.
// Програма завершується аварійно.
public class Main {

    // Оголошуємо виняток
    public static void main(String[] args) throws IOException {
        SomeClass someClass = new SomeClass();
        // Виклик методу, який викидає виняток
        someClass.someMethod();
        // Подальший код НЕ буде виконуватись
        System.out.println("Some code.");
    }
}
