package ua.hillel.lessons.lesson8.demos._07_throws_keyword._02;

import java.io.IOException;

public class SomeClass {
    // Метод оголошує перевіряємий виняток
    public void someMethod() throws IOException {
        // Викидається перевіряємий виняток цим методом
        throw new IOException("Checked exception.");
    }
}
