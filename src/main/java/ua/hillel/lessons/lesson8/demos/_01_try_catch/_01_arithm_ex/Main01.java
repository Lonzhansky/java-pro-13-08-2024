package ua.hillel.lessons.lesson8.demos._01_try_catch._01_arithm_ex;

// Виняток необробляється.
// Блоку try-catch немає.
public class Main01 {

    public static void main(String[] args) {
        // Код, який може викликати виняток.
        // Ділення на нуль.
        int result = 30 / 0;
        // Цей код не буде виконаний, оскільки
        // попередній код викине виняток
        System.out.println("Result is " + result);
        // Подальший код не буде виконаний
        System.out.println("Some code.");
    }
}
