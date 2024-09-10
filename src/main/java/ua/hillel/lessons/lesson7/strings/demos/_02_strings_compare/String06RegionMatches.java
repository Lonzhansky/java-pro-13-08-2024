package ua.hillel.lessons.lesson7.strings.demos._02_strings_compare;

// Метод regionMatches() перевіряє, чи рівні дві області String.
// Важливі моменти:
// - ignoreCase вказує, чи слід ігнорувати регістр обох рядків
// - toffset визначає початковий індекс першого рядка
// - other визначає другий рядок.
// - ooffset визначає початковий індекс другого рядка
// - len визначає кількість символів для порівняння
public class String06RegionMatches {

    public static void main(String[] args) {

        String a = "This orange is tasty";

        // Перевіряємо, чи рівні дві рядкові області.

        String b = "This big orange is tasty";
        // Порівнюємо "orange" обох рядків
        boolean isMatch = a.regionMatches(5, b, 9, 6);
        System.out.println("1) These parts are match? " + isMatch);

        b = "This big Orange is tasty";
        // Порівнюємо "orange" та "Orange",
        // без ігнорування регістру
        isMatch = a.regionMatches(5, b, 9, 6);
        System.out.println("2) These parts are match? " + isMatch);

        // Якщо ignoreCase передається як істина,
        // при порівнянні символів ігнорується регістр.
        // Порівнюємо "orange" та "Orange",
        // без ігнорування регістру
        isMatch = a.regionMatches(true,5, b, 9, 6);
        System.out.println("3) These parts are match? " + isMatch);
    }
}
