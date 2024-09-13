package ua.hillel.lessons.lesson8.demos._07_throws_keyword._01._012;

import java.io.IOException;

public class SomeClass {
    // Метод оголошує виняток
    void someMethod() throws IOException {
        // Викидається виняток цим методом
        throw new IOException("Mistake!");
    }
}
