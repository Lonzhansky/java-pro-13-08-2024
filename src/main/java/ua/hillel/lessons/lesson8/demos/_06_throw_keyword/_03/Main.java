package ua.hillel.lessons.lesson8.demos._06_throw_keyword._03;

// Перевіряємий виняток IllegalArgumentException
// обробляється через try-catch.
public class Main {

    public static void main(String[] args) {
        // Вхідні дані.
        // Для викидання винятку треба змінити значення на таке,
        // що перевищує встановлений ліміт для вантажу
        int weight = 400;
        // Виклик методів обробки вхідних даних
        getOutput(checkWeight(weight));
        // Подальший код буде виконаний, оскільки виняток обробляється
        getOutput("Some code.");
    }

    // Метод перевіряє значення ваги вантажу
    private static String checkWeight(int weight) {
        Cargo cargo = new Cargo();
        // Обробка винятку через try-catch
        try {
            // Код, який може викинути виняток
            cargo.setWeight(weight);
        } catch (IllegalArgumentException e) {
            // Повернення повідомлення винятку
            return e.getMessage();
        }
        // Повернення повідомлення при відсутності винятку
        return "Weight " + cargo.getWeight() + " is OK.";
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
