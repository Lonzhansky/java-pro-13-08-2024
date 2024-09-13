package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._01._011;

import ua.hillel.lessons.lesson8.exceptions.person.AgeException;

// Перевірка віку.
// Якщо вік менше певної кількості років, генеруємо кастомний виняток,
// інакше виводимо відповідне повідомлення.
public class Main {

    private static final int AGE_LOWER_LIMIT = 18;

    public static void main(String[] args) {
        // Вхідні дані. Для виняткової ситуації
        // можна встановити значення менше встановленої межи
        int age = 15;
        // Виклик методів обробки вхідних даних
        getOutput(validate(age));
        // Подальший код буде виконаний, навіть якщо валідацію не пройдено,
        // оскільки виняток обробляється
        System.out.println("Some code.");
    }

    // Метод, який виконує валідацію значення та обробляє виняток
    private static String validate(int age) {
        // Обробка винятку через try-catch
        try {
            if (age < AGE_LOWER_LIMIT) {
                // Кастомний виняток, що викидається через створення
                // об'єкту винятку
                throw new AgeException("Age " + age + " is wrong!");
            }
        } catch (AgeException e) {
            // Повідомлення про виняток
            return e.getMessage();
        }
        // Повідомлення при проходжені умов валідації
        return "Age " + age + " is OK!";
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
