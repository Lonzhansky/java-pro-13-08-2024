package ua.hillel.lessons.lesson8.demos._07_throws_keyword._01._013;

import java.io.IOException;

public class SomeClass {
    // Метод оголошує виняток, навіть якщо він не викидається
    void someMethod() throws IOException {
        // НЕ викидається виняток цим методом
        System.out.println("Task has completed.");
    }
}
