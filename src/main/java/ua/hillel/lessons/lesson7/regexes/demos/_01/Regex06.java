package ua.hillel.lessons.lesson7.regexes.demos._01;

import java.util.regex.Pattern;

public class Regex06 {

    public static void main(String[] args) {

        String text = "Sunny1Shop2is3a4good5shop6";

        // Метасимвол \d (цифра: [0-9]), тобто
        // розділяємо текст за цифрою
        String delimiter = "\\d";

        Pattern pattern = Pattern.compile(delimiter,
                Pattern.CASE_INSENSITIVE);

        // Пошук без урахування регістру.
        // Метод split() розбиває заданий рядок на збіги
        // із заданим регулярним виразом.
        String[] result = pattern.split(text);

        for (String str : result)
            System.out.println(str);
    }
}
