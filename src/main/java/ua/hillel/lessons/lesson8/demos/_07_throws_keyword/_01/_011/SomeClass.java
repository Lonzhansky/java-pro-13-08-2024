package ua.hillel.lessons.lesson8.demos._07_throws_keyword._01._011;

import java.io.IOException;

class SomeClass {
    // Метод оголошує виняток
    void someMethod() throws IOException {
        // Викидається виняток цим методом
        throw new IOException("Mistake!");
    }
}
