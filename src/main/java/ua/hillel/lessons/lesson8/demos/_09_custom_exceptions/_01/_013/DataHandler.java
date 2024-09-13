package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._01._013;

// Обробка даних з урахуванням можливих винятків
public class DataHandler {

    public String handleData(String data) {
        DataValidator validator = new DataValidator();
        // Обробка стандартних винятків IllegalArgumentException, ArithmeticException
        // через кастомний виняток AgeException
        try {
            // Повернення даних при відсутності винятку
            return validator.validateAge(validator.validateInputData(data));
        } catch (IllegalArgumentException | ArithmeticException e) {
            // Повернення повідомлення кастомного винятку з деталізацією
            // через стандартний виняток
            return new AgeException("Age exception: ", e).getMessage()
                    + e.getMessage();
        }
    }
}
