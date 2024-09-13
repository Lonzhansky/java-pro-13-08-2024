package ua.hillel.lessons.lesson8.demos._01_try_catch._01_arithm_ex;

// Обробка винятку через клас Exception
public class Main04 {

    public static void main(String[] args) {

        // Вхідне значення
        int result = 0;

        // Обробка винятку через клас Exception
        try {
            // Код, який може викликати виняток
            result = 15 / 0;
        } catch (Exception e) {
            // Виведення повідомлення про виняток
            System.out.println("Exception: " + e);
        }

        // Результат не обраховується через виняток
        System.out.println("Result is " + result);
        // Подальший код буде виконаний, оскільки
        // присутня обробка винятку
        System.out.println("Some code.");
    }
}
