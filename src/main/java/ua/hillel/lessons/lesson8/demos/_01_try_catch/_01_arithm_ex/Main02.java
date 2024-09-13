package ua.hillel.lessons.lesson8.demos._01_try_catch._01_arithm_ex;

// Виняток обробляється.
// Блок try-catch присутній.
public class Main02 {

    public static void main(String[] args) {
        // Вхідне значення
        int result = 0;

        // Обробка винятку
        try {
            // Код, який може викликати виняток.
            // Ділення на нуль.
            result = 15 / 0;
        } catch (ArithmeticException e) {
            // Виведення повідомлення про виняток
            System.out.println("Exception: " + e.getMessage());
        }

        // Цей код буде виконаний, оскільки присутня обробка винятку,
        // але результат не буде обраховуватись через виняток
        System.out.println("Result is " + result);
        // Подальший код буде виконаний, оскільки присутня обробка винятку
        System.out.println("Some code.");
    }
}
