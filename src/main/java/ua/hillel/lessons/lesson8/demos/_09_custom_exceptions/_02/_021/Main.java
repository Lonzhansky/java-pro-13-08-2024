package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._021;

// Перевірка кількості, яка має бути в певному діапазоні.
// Якщо кількість не в діапазоні, генеруємо кастомний виняток,
// інакше виводимо відповідне повідомлення.
public class Main {

    private static final int QUOTA_LOWER_LIMIT = 0;
    private static final int QUOTA_UPPER_LIMIT = 3;

    public static void main(String[] args) {
        // Вхідні дані. Для виняткової ситуації
        // можна встановити значення за необхідним діапазоном
        int qnty = 2;
        // Виклик методів обробки вхідних даних
        getOutput(handleData(qnty));
        // Подальший код буде виконаний, навіть якщо валідацію не пройдено,
        // оскільки виняток обробляється
        getOutput("Some code.");
    }

    // Метод обробки вхідних даних
    private static String handleData(int quota) {
        // Обробка винятку через try-catch
        try {
            // Виклик методу валідації вхідних даних
            return validateQuota(quota);
        } catch (QuotaException ex) {
            // Повідомлення кастомного винятку
            return ex.getMessage();
        }
    }

    // Метод валідації кількості, який може викинути кастомний виняток
    private static String validateQuota(int quota) {
        if (quota > QUOTA_LOWER_LIMIT & quota <= QUOTA_UPPER_LIMIT) {
            // Повернення повідомлення при проходжені умов валідації
            return "Quota " + quota + " is OK.";
        } else {
            // Викид кастомного винятку
            throw new QuotaException("Quota " + quota + " is wrong!");
        }
    }

    // Виведення результату роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
