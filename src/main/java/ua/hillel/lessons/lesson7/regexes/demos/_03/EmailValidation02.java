package ua.hillel.lessons.lesson7.regexes.demos._03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Регулярний вираз для обмеження числа
// символів у домені верхнього рівня.
// Ім'я домену містило хоча б одну точку, а частина імені
// домена після останньої точки могла складатися лише з літер.
//
// Допустимо, доменні імена схожі на secondlevel.com або
// Thirdlevel.secondlevel.com.
// Домен верхнього рівня (.com у цих прикладах) повинен складатися
// тільки з двох-шести літер.
public class EmailValidation02 {

    public static void main(String[] args) {

        String[] emails = {
                "user@mail.com",
                "user@mail.co.ua",
                "user.name@mail.com",
                "user_name@mail.com",
                "username@sunny.corporate.ua",
                ".username@sunny.com",
                "username@sunny.com.",
                "username@sunny..com",
                "username@sunny.c",
                "username@sunny.corporate"
        };

        for (String email : emails) {
            System.out.println(email + " - " + isValidEmail(email));
        }

    }

    public static boolean isValidEmail(String email) {

        // Регулярний вираз для перевірки е-пошти
        String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$" +
                "%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

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
