package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._023;


// Обробка даних з урахуванням можливих винятків
public class DataHandler {

    public String handleData(String data) {
        DataValidator validator = new DataValidator();
        // Обробка стандартних винятків IllegalArgumentException, ArithmeticException
        // через кастомний виняток QuotaException
        try {
            // Повернення даних при відсутності винятку
            return validator.validateQuota(validator.validateInputData(data));
        } catch (IllegalArgumentException | ArithmeticException e) {
            // Повернення повідомлення кастомного винятку з деталізацією
            // через стандартний виняток
            return new QuotaException("Quota exception: ", e).getMessage()
                    + e.getMessage();
        }
    }
}
