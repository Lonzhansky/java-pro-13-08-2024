package ua.hillel.lessons.lesson8.demos._07_throws_keyword._01._013;

import java.io.IOException;

// Оголошуємо виняток, виняток НЕ виникає.
// У разі, якщо ми оголосимо виняток, і якщо виняток не
// станеться, код буде виконано нормально.
class Main {

    // Оголошуємо виняток, навіть якщо виняток не виникає.
    public static void main(String[] args) throws IOException {
        SomeClass someClass = new SomeClass();
        // Виклик методу, який НЕ викидає виняток
        someClass.someMethod();
        // Подальший код виконується
        System.out.println("Some code.");
    }
}
