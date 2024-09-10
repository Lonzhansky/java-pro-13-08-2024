package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Метод indexOf() та його варіації
public class String09IndexOf {

    public static void main(String[] args) {

        String str = "Orange is very good";
//        str = "Apple is excellent";

        // Метод повертає індекс першого
        // вказаного символу у рядку
        // або -1, якщо такого символу немає.
        System.out.println("1) Found character first at index " +
                str.indexOf('g'));

        // Метод повертає індекс у цьому рядку першого
        // входження зазначеного символу, починаючи пошук за
        // зазначеним індексом, або -1, якщо такого символу немає.
        System.out.println("2) Found character after index at index " +
                str.indexOf('g', 5));

        // Метод повертає індекс у рядку першого входження
        // зазначеного підрядка.
        // Якщо немає такого підрядка, повертається -1.
        String subStr = "very";
        System.out.println("3) Found substring starting at index " +
                str.indexOf(subStr));

        // Метод повертає індекс у рядку першого входження
        // зазначеного підрядка, починаючи із зазначеного індексу.
        // Якщо немає такого підрядка, повертається -1.
        str = "Sunny shop is good shop always";
        subStr = "shop";
        System.out.println("4) Found substring (after index) starting at index " +
                str.indexOf(subStr, 12));
    }
}
