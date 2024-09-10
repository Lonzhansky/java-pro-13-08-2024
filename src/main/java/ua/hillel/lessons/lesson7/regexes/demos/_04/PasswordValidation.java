package ua.hillel.lessons.lesson7.regexes.demos._04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static void main(String[] args) {

        // Набір паролів
        String[] passwords = {
                "Shop@sunny20",
                "Shopisshop",
                "Shop@ sunny9",
                "4321",
                "Sun@20",
                "shop@sunny20"
        };

        for (String pass : passwords) {
            System.out.println(pass + " - " + isValidPassword(pass));
        }

    }

    public static boolean isValidPassword(String password) {

        // Резулярний вираз для перевірки паролю
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern pattern = Pattern.compile(regex);

        // Якщо пароль відсутній, повертається false
        if (password == null) {
            return false;
        }

        // Клас Pattern містить метод matcher(),
        // щоб знайти відповідність між заданим паролем
        // та регулярним виразом.
        Matcher mtch = pattern.matcher(password);

        // Повертаємо, якщо є співпадіння з регулярним виразом
        return mtch.matches();
    }
}
