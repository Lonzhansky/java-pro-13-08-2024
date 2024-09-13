package ua.hillel.lessons.lesson8.demos._05_finally_block;

// Код генерує виняток у блоці try, блок catch обробляє виняток.
// Пізніше блок finally виконується після блоку try-catch.
// Далі, решта коду також виконується нормально.
public class Main03 {

    public static void main(String[] args) {

        try {
            System.out.println("In try block.");
            // Код кидає виняток
            int result = 25 / 0;
            // Код не буде виконаний
            System.out.println("Result is " + result);
        }
        // Вірна обробка ArithmeticException, ділення на нуль
        catch (ArithmeticException e) {
            // Повідомлення про виняток
            System.out.println("Exception: " +
                    e.getMessage());
        }
        // Виконується незалежно від наявності винятку.
        finally {
            System.out.println("Finally block.");
        }
        // Подальший код буде виконаний, оскільки присутня
        // відповідна обробка винятку
        System.out.println("Some code.");
    }
}
