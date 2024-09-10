package ua.hillel.lessons.lesson7.strings.demos._07_string_generate;

import java.util.Random;

// Based on: https://www.baeldung.com/java-random-string
public class Main {

    public static void main(String[] args) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println("Generated string: " + generatedString);
    }
}
