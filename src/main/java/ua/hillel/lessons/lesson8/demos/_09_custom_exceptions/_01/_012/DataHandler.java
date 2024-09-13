package ua.hillel.lessons.lesson8.demos._09_custom_exceptions._01._012;

// Обробка даних з урахуванням можливих винятків
public class DataHandler {

    public String handleData(String data) {
        DataValidator validator = new DataValidator();
        // Обробка винятків IllegalArgumentException, AgeException
        try {
            // Повернення даних при відсутності винятку
            return validator.validateAge(validator.validateInputData(data));
        }  catch (IllegalArgumentException | AgeException e) {
            // Повернення повідомлення про виняток
            return e.getMessage();
        }
    }
}
