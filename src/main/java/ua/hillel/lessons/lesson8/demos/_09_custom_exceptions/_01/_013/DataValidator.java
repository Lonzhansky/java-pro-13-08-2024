package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._01._013;

public class DataValidator {

    private static final int AGE_LOWER_LIMIT = 18;
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

    // Метод валідації віку, який може викинути
    // стандартний виняток ArithmeticException
    public String validateAge(String age) throws ArithmeticException {
        // Умова валідації: вік не має перевищувати певну межу
        if (Integer.parseInt(age) < AGE_LOWER_LIMIT) {
            // Викидання стандартного винятку через throw
            throw new ArithmeticException("Age " + age + " is lower of "
                    + AGE_LOWER_LIMIT + "!");
        }
        // Повідомлення при проходжені умов валідації
        return "Age " + age + " is OK.";
    }
}
