package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._02._022;

// Обробка даних з урахуванням можливих винятків
public class DataHandler {

    public String handleData(String data) {
        DataValidator validator = new DataValidator();
        // Обробка винятків IllegalArgumentException, QuotaException
        try {
            // Повернення даних при відсутності винятку
            return validator.validateQuota(validator.validateInputData(data));
        } catch (IllegalArgumentException | QuotaException e) {
            // Повернення повідомлення про виняток
            return e.getMessage();
        }
    }
}
