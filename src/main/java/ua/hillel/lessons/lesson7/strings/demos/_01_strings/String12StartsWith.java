package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// startsWith() — метод, який перевіряє, чи починається рядок
// з певного рядка. Якщо так - повертає true, ні - повератє false.
// Можна також передати індекс першого символу,
// з якого починається перевірка.
public class String12StartsWith {

    public static void main(String[] args) {

        String str = "Orange is very good";

        // Перевірка початку рядку з O
        boolean isStarts1 = str.startsWith("O");
        System.out.println("1) " + isStarts1);

        // Перевірка початку рядку з Oran
        boolean isStarts2 = str.startsWith("Oran");
        System.out.println("2) " + isStarts2);

        // Перевірка початку рядку з F
        boolean isStarts3 = str.startsWith("F");
        System.out.println("3) " + isStarts3);

        // Перевірка початку рядку з App
        boolean isStarts4 = str.startsWith("App");
        System.out.println("4) " + isStarts4);

        // Перевірка початку певного підрядку рядку з певного індексу
        boolean isStarts5 = str.startsWith("ange", 2);
        System.out.println("5) " + isStarts5);

        // Перевірка початку певного підрядку рядку з певного індексу
        boolean isStarts6 = str.startsWith("rang", 2);
        System.out.println("6) " + isStarts6);

    }
}
