package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Метод contains() шукає послідовність символів у рядку.
// Повертає true, якщо в цьому рядку знайдено послідовність
// значень char, інакше повертає false.
public class String04Contains {

    public static void main(String[] args) {
        String str = "Sunny shop offers a lot of fruits";
        // true
        boolean isContain1 = str.contains("Sunny shop");
        System.out.println("1) Result is " + isContain1);
        // true
        boolean isContain2 = str.contains("a lot of");
        System.out.println("2) Result is " + isContain2);
        // false
        boolean isContain3 = str.contains("vegetables");
        System.out.println("3) Result is " + isContain3);
    }
}
