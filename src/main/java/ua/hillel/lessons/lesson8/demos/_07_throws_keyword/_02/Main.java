package ua.hillel.lessons.lesson8.demos._07_throws_keyword._02;

import java.io.IOException;

// Перевіряємий виняток може бути поширеним
// (перенаправлено у стек викликів).
// Це надає інформацію про виняток стороні, що викликає.
// Перевіряємі винятки можуть бути передані
// на подальшу обробку за допомогою throws.
public class Main {

    public static void main(String[] args) {
        someMethodA();
        // Подальший код буде виконано,
        // оскільки виняток обробляється
        System.out.println("Some code.");
    }

    // Метод, який обробляє виняток
    static void someMethodA() {
        // Обробка винятку за допомогою блоку try-catch.
        try {
            // Виклик метода, який викликає метод,
            // який, у свою чергу, викликає метод,
            // який викидає виняток
            someMethodB();
        } catch (IOException e) {
            System.out.println("Exception has processed.");
        }
    }

    // Оголошення переіряємого винятку через throws,
    // для передачі на подальшу обробку
    static void someMethodB() throws IOException {
        SomeClass someClass = new SomeClass();
        // Виклик метода, який викидає
        // перевіряємий виняток
        someClass.someMethod();
    }
}
