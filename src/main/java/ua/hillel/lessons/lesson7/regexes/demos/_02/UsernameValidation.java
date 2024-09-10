package ua.hillel.lessons.lesson7.regexes.demos._02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Валідація імені користувача
public class UsernameValidation {

    static String input;

    public static void main(String[] args) {

        input = "SunnyShop";
        System.out.println("1) " + isValidUsername(input));

        input = "3SunnyShop";
        System.out.println("2) " + isValidUsername(input));

        input = "Sun";
        System.out.println("3) " + isValidUsername(input));
    }

    public static boolean isValidUsername(String name) {

        // Регулярний вираз для перевірки імені користувача
        String regex = "^[A-Za-z]\\w{5,17}$";

        Pattern pattern = Pattern.compile(regex);

        // Якщо ім'я користувача відсутнє, повертається false
        if (name == null) {
            return false;
        }

        // Клас Pattern містить метод matcher(),
        // щоб знайти відповідність між заданим ім'ям користувача
        // та регулярним виразом
        Matcher mtch = pattern.matcher(name);

        // Повертаємо, якщо є співпадіння з регулярним виразом
        return mtch.matches();
    }
}
