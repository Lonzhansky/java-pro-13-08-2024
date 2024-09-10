package ua.hillel.lessons.lesson7.regexes.demos._01;

import java.util.regex.Pattern;

// Регулярний вираз .*berry.*
// використовується для пошуку появи рядка
// "berry" в тексті.
public class Regex01 {

    public static void main(String[] args) {

        String content = "Strawberry is a good product";

        String pattern = ".*berry.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("The text contains 'berry'? " + isMatch);
    }
}
