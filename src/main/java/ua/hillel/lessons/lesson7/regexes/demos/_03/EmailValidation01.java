package ua.hillel.lessons.lesson7.regexes.demos._03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Перевірка е-пошти
public class EmailValidation01 {

    public static void main(String[] args) {

        String[] emails = {
                "Shopi|sshop",
                "Shop@ sunny9",
                "4321",
                "@mail,com",
                "shop@",
                "shop@mail.com",
                "tom@mail.com",
                "my.shop@mail.com"
        };

        for (String email : emails) {
            System.out.println(email + " - " + isValidEmail(email));
        }

    }

    public static boolean isValidEmail(String email) {

        // Регулярний вираз для перевірки е-пошти
        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        // Якщо email відсутній, повертається false
        if (email == null) {
            return false;
        }

        // Клас Pattern містить метод matcher(),
        // щоб знайти відповідність між заданим email
        // та регулярним виразом.
        Matcher mtch = pattern.matcher(email);

        // Повертаємо, якщо є співпадіння з регулярним виразом
        return mtch.matches();
    }
}
