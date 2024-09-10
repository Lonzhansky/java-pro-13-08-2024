package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// endsWith() - метод, який перевіряє, чи рядок закінчується певним
// заданим рядком. Якщо так - повертає true, ні - повертає false.
// Якщо аргумент методу є порожнім рядком, тоді метод повертає true.
public class String13EndsWith {

    public static void main(String[] args) {

        String str = "Orange is very good";

        // Перевірка закінчення рядку на d
        boolean isEnds1 = str.endsWith("d");
        System.out.println("1) " + isEnds1);

        // Перевірка закінчення рядку на ood
        boolean isEnds2 = str.endsWith("ood");
        System.out.println("2) " + isEnds2);

        // Перевірка закінчення рядку на o
        boolean isEnds3 = str.endsWith("o");
        System.out.println("3) " + isEnds3);

        // Перевірка закінчення рядку на do
        boolean isEnds4 = str.endsWith("do");
        System.out.println("4) " + isEnds4);

        // Перевірка закінчення рядку на порожнє значення
        boolean isEnds5 = str.endsWith("");
        System.out.println("5) " + isEnds5);

    }
}
