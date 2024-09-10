package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Вибірка підрядка
public class String03Substring {

    public static void main(String[] args) {

        String str = "Very cret seinformation!";

        // Виділяємо підрядок
        // від індексу символу, включно, та
        // до індексу символу, виключно.
        String subStrA = str.substring(5, 11);
        String subStrB = str.substring(14);

        System.out.println(subStrA);
        System.out.println(subStrB);
    }
}
