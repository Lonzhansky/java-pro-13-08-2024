package ua.hillel.lessons.lesson7.regexes.demos._01;

import java.util.regex.Pattern;

// Метод Pattern.matches() компілює зазначений регулярний вираз
// та порівнює з рядковим значенням, яке передається на вхід.
// Регулярний вираз виступає як шаблон для зіставлення/порівняння.
// Якщо зіставлення успішне, повертається true, інакше - false.
public class Regex02 {

    public static void main(String[] args) {

        // Повернеться true, якщо рядок точно відповідає "tom"
        System.out.println("1) " +
                Pattern.matches("tom", "Tom"));

        // Повертає true, якщо рядок точно збігається
        // "tom" або "Tom"
        System.out.println("2) " +
                Pattern.matches("[Tt]om", "Tom"));
        System.out.println("3) " +
                Pattern.matches("[Tt]om", "Tom"));

        // Повертає true, якщо рядок відповідає "tim"
        // або "Tim" або "jin" або "Jin"
        System.out.println("4) " +
                Pattern.matches("[tT]im|[jJ]in", "Tim"));
        System.out.println("5) " +
                Pattern.matches("[tT]im|[jJ]in", "jin"));

        // Повертає true, якщо рядок містить "abc" у будь-якому місці
        System.out.println("6) " +
                Pattern.matches(".*abc.*", "deabcpq"));

        // Повертає true, якщо рядок не має числа на початку
        System.out.println("7) " +
                Pattern.matches("^[^\\d].*", "123abc"));
        System.out.println("8) " +
                Pattern.matches("^[^\\d].*", "abc123"));

        // Повертає true, якщо рядок складається із трьох літер
        System.out.println("9) " +
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));
        System.out.println("10) " +
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));
        System.out.println("11) " +
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));

        // Повертає true, якщо рядок містить 0 або більше нецифр
        System.out.println("12) " +
                Pattern.matches("\\D*", "abcde"));
        System.out.println("13) " +
                Pattern.matches("\\D*", "abcde123"));

        // Зіставлення меж
        // ^ означає початок рядка
        // $ позначає кінець рядка
        System.out.println("14) " +
                Pattern.matches("^This$", "This is Robert"));
        System.out.println("15) " +
                Pattern.matches("^This$", "This"));
        System.out.println("16) " +
                Pattern.matches("^This$", "Is This Robert"));
    }
}
