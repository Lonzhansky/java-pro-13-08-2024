package ua.hillel.lessons.lesson8.demos._06_throw_keyword._01;

// Перевірка віку.
// Якщо вік менше певної кількості років, генеруємо виняток ArithmeticException,
// інакше виводимо відповідне повідомлення.
// Код методу генерує неперевіряємий виняток ArithmeticException,
// тому метод повинен обробити виняток (тут, обробляється).
public class Main02 {

    private static final int AGE_LOWER_LIMIT = 18;

    public static void main(String[] args) {
        // Вхідні дані
        int age = 14;
        // Виклик методів обробки вхідних даних
        getOutput(validateAge(age));
        // Подальший код буде виконаний, навіть якщо валідацію не пройдено,
        // оскільки виняток обробляється
        System.out.println("Some code.");
    }

    // Метод, який виконує валідацію значення та обробляє виняток
    public static String validateAge(int age) {
        // Обробка винятку через try-catch
        try {
            if (age < AGE_LOWER_LIMIT) {
                // Виняток, що викидається через створення об'єкту винятку
                throw new ArithmeticException("Age is wrong!");
            }
        } catch (ArithmeticException e) {
            // Повідомлення про виняток
            return e.getMessage();
        }
        // Повідомлення при проходжені умов валідації
        return "Age is OK!";
    }

    // Виведення результату роботи програми
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
