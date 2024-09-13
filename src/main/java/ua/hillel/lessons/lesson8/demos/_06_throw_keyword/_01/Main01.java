package ua.hillel.lessons.lesson8.demos._06_throw_keyword._01;

// Перевірка віку.
// Якщо вік менше певної кількості років, генеруємо виняток ArithmeticException,
// інакше виводимо відповідне повідомлення.
// Код методу генерує неперевіряємий виняток ArithmeticException,
// тому метод повинен обробити виняток (тут, не обробляється).
public class Main01 {

    private static final int AGE_LOWER_LIMIT = 18;

    public static void main(String[] args) {
        // Вхідні дані
        int age = 14;
        // Виклик методів обробки вхідних даних
        getOutput(validateAge(age));
        // Подальший код не буде виконаний, якщо валідацію не пройдено
        System.out.println("Some code.");
    }

    // Метод, який виконує валідацію вхідних даних та не обробляє виняток
    public static String validateAge(int age) {
        if (age < AGE_LOWER_LIMIT) {
            // Виняток, що викидається через створення об'єкту винятку
            throw new ArithmeticException("Age is wrong!");
        } else {
            // Повідомлення при проходжені умов валідації
            return "Age is OK!";
        }
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
