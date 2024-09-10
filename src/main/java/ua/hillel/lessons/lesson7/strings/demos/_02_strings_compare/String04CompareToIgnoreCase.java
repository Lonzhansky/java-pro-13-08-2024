package ua.hillel.lessons.lesson7.strings.demos._02_strings_compare;

// compareToIgnoreCase() - порівнює два рядки
// лексикографічно, ігноруючи відмінності у регістрі.
// Повертає:
// - позитивне ціле число, якщо цей рядок більше аргументу.
// - негативне ціле число, якщо цей рядок менший за аргумент.
// - нуль, якщо цей рядок дорівнює аргументу.
public class String04CompareToIgnoreCase {

    public static void main(String[] args) {

        String a = "Kiwi";
        String b = "Kiwi";
        String c = "KIWI";
        String d = "POTATO";

        // Порівняння a до b
        int res = a.compareTo(b);
        System.out.println("1) The result is " + res);

        // Порівняння a до c
        // з ігноруванням регістру
        res = a.compareToIgnoreCase(c);
        System.out.println("2) The result is " + res);

        // Порівняння a до d
        // з ігноруванням регістру
        res = a.compareToIgnoreCase(d);
        System.out.println("3) The result is " + res);

        // Порівняння d до a
        // з ігноруванням регістру
        res = d.compareToIgnoreCase(a);
        System.out.println("4) The result is " + res);
    }
}
