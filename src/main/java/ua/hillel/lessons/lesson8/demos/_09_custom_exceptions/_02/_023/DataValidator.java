package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._023;

// Валідатор даних. Застосовуємо throw та throws
public class DataValidator {

    private static final int QUOTA_LOWER_LIMIT = 0;
    private static final int QUOTA_UPPER_LIMIT = 3;
    // Регулярний вираз. Можна тільки цілі позитивні числа
    public static final String INPUT_REGEX = "^\\d+$";

    // Метод валідації вхідних даних щодо певної
    // умови (регулярному виразу), який може викинути
    // стандартний виняток IllegalArgumentException
    public String validateInputData(String input) throws IllegalArgumentException {
        if (!input.matches(INPUT_REGEX))
            // Викидання стандартного винятку через throw
            throw new IllegalArgumentException(input + " is wrong data!");
        // Повернення вхідного значення при відсутності винятку
        return input;
    }

    // Метод валідації кількості, який може викинути
    // стандартний виняток ArithmeticException
    public String validateQuota(String quota) throws ArithmeticException {
        // Умова валідації: кількість має бути у певному діапазоні
        if (Integer.parseInt(quota) > QUOTA_LOWER_LIMIT
                & Integer.parseInt(quota) <= QUOTA_UPPER_LIMIT) {
            // Повідомлення при проходжені умов валідації
            return "Quota " + quota + " is OK.";
        } else {
            // Викидання стандартного винятку через throw
            throw new ArithmeticException("Quota " + quota +
                    " is wrong!");
        }
    }
}
