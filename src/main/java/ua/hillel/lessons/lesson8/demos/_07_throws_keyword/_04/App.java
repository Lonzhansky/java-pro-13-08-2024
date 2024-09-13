package ua.hillel.lessons.lesson8.demos._07_throws_keyword._04;

public class App {

    public static void main(String[] args) {
        // Вхідні дані.
        // Для викидання винятку треба змінити значення на таке,
        // що перевищує встановлений ліміт для вантажу
        int weight = 400;
        // Виклик методів обробки вхідних даних
        getOutput(getResult(weight));
        // Подальший код буде виконаний, оскільки виняток обробляється
        getOutput("Some code.");
    }

    private static String getResult(int weight) {
        // Обробка винятку через try-catch
        try {
            // Виклик методів обробки вхідних даних.
            // Код, який може викинути виняток
            return new AppValidator().validateWeight(weight);
        } catch (IllegalArgumentException e) {
            // Повернення повідомлення винятку
            return e.getMessage();
        }
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
