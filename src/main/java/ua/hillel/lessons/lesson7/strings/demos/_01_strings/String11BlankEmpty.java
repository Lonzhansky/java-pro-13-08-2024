package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// isBlank() повертає true, якщо рядок
// порожній або містить лише кодові точки
// з пробілами, інакше - false.
// УВАГА. Починаючи із JDK 11.
//
// isEmpty() повертає true тоді і тільки
// тоді, коли length() дорівнює 0.
public class String11BlankEmpty {

    static String str;

    public static void main(String[] args) {

        str = "";
        System.out.println("1) Blank is " + str.isBlank());
        System.out.println("2) Empty is " + str.isEmpty());

        str = " "; // <- пробіл
        System.out.println("3) Blank is " + str.isBlank());
        System.out.println("4) Empty is " + str.isEmpty());

        str = "Y";
        System.out.println("5) Blank is " + str.isBlank());
        System.out.println("6) Empty is " + str.isEmpty());
    }
}
