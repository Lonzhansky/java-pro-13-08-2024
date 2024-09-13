package ua.hillel.lessons.lesson8.demos._01_try_catch._01_arithm_ex;

// Якщо у блоці try виникає виняток,
// решта коду блоку не буде виконуватися.
public class Main03 {

    public static void main(String[] args) {

        // Обробка винятку
        try {
            // Код, який може викликати виняток
            int result = 15 / 0;
            // Подальший код в блоці try
            System.out.println("Code in try block." + result);
        } catch (ArithmeticException e) {
            // Виведення повідомлення про виняток
            System.out.println("Exception: " + e);
        }

        // Подальший код буде виконаний, оскільки присутня обробка винятку
        System.out.println("Some code.");
    }
}
