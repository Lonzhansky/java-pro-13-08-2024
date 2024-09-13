package ua.hillel.lessons.lesson8.demos._05_finally_block;

import java.util.Scanner;

// Не генеруємо жодних винятків,
// а блок finally виконується після блоку try.
public class Main01 {

    public static void main(String[] args) {

        try {
            // Код не викликає будь-яких винятків
            int result = 15 / 5;
            System.out.println("Result is " + result);
        }
        // catch не буде виконано, оскільки
        // не відповідає типу винятку, повинен бути
        // ArithmeticException
        catch (NullPointerException e) {
            // Повідомлення про виняток
            System.out.println("Exception: " + e);
        }
        // Виконується незалежно від виникнення винятку
        finally {
            System.out.println("Finally block.");
        }
        // Подальший код буде виконаний
        System.out.println("Some code.");
    }
}
