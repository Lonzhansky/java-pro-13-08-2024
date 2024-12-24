package ua.hillel.lessons.lesson30._demos.hql.app.utils;

import java.util.HashMap;
import java.util.Map;

public class AppValidator {

    // Regex для id.
    // Регулярний вираз для позитивних цілих чисел без нулів, мінусів або ком на початку.
    // ^ вказує на початок рядка
    // [1-9] відповідає будь-якій цифрі від 1 до 9 і гарантує відсутність нулів на початку.
    // $ вказує на кінець рядка
    public final static String ID_RGX = "^[1-9]$";

    // Regex для телефону у форматі xxx xxx-xxxx
    public final static String PHONE_RGX = "[0-9]{3} [0-9]{3}-[0-9]{4}";

    // Regex для email
    public final static String EMAIL_RGX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    // Валідація вхідного значення id
    public static boolean isIdValid(String id) {
        if (id != null)
            return id.isEmpty() || !id.matches(ID_RGX);
        return false;
    }

    // Валідація вхідного значення телефона
    public static boolean isPhoneValid(String phone) {
        if (phone != null)
            return phone.isEmpty() || !phone.matches(PHONE_RGX);
        return false;
    }

    // Валідація вхідного значення email
    public static boolean isEmailValid(String email) {
        if (email != null)
            return email.isEmpty() || !email.matches(EMAIL_RGX);
        return false;
    }

    public static Map<String, String> validateContactData(Map<String, String> data) {

        Map<String, String> errors = new HashMap<>();

        if (data.containsKey("id") & AppValidator.isIdValid(data.get("id")))
            errors.put("id", Message.WRONG_ID_MSG.getMessage());

        if (data.containsKey("first_name")) {
            if (data.get("first_name") != null & data.get("first_name").isEmpty())
                errors.put("first name", Message.INPUT_REQ_MSG.getMessage());
        }

        if (data.containsKey("last_name")) {
            if (data.get("last_name") != null & data.get("last_name").isEmpty())
                errors.put("last name", Message.INPUT_REQ_MSG.getMessage());
        }

        if (data.containsKey("phone") & AppValidator.isPhoneValid(data.get("phone")))
            errors.put("phone", Message.WRONG_PHONE_MSG.getMessage());

        if (data.containsKey("email") & AppValidator.isEmailValid(data.get("email")))
            errors.put("email", Message.WRONG_EMAIL_MSG.getMessage());

        return errors;
    }
}
