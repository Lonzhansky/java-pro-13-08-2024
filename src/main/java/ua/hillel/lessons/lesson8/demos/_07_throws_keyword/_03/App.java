package ua.hillel.lessons.lesson8.demos._07_throws_keyword._03;

public class App {

    public static void main(String[] args) {
        // Вхідне значення
        int age = 14;
        // Виклик методів обробки вхідних даних
        getOutput(getResult(age));
        // Подальший код буде виконаний, оскільки присутня
        // обробка винятку
        getOutput("Some code.");
    }

    private static String getResult(int age) {
        // Обробка винятку через try-catch
        try {
            // Виклик методу, який виконує валідацію значення
            // та може викинути виняток
            return new AppValidator().validateAge(age);
        } catch (ArithmeticException e) {
            // Повернення повідомлення про виняток
            return e.getMessage();
        }
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
