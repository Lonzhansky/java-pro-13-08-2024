package ua.hillel.lessons.lesson8.demos._07_throws_keyword._03;

// Клас, який має метод(и) валідації вхідних даних
public class AppValidator {

    private static final int AGE_LOWER_LIMIT = 18;

    // Метод, який виконує валідацію значення та оголошує виняток.
    // Валідація віку. Якщо вік менше певної кількості років,
    // генеруємо виняток ArithmeticException, інакше повертаємо
    // відповідне повідомлення.
    public String validateAge(int age) throws ArithmeticException {
        if (age < AGE_LOWER_LIMIT) {
            // Виняток, що викидається через створення об'єкту винятку
            throw new ArithmeticException("Age " + age + " is wrong!");
        } else {
            // Повернення повідомлення при проходжені умов валідації
            return "Age " + age + " is OK.";
        }
    }
}
