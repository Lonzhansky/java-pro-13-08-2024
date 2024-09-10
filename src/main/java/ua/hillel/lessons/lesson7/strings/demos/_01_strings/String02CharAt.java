package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Метод charAt() повертає символ за вказаним індексом у рядку.
// Перший символ має індекс 0, а останній – довжина рядка мінус 1.
public class String02CharAt {

    public static void main(String[] args) {

        String str = "Sunny shop";

        // Виведення першого символу рядка, індекс 0
        System.out.println("1) Result is " + str.charAt(0));

        // Виведення символу на певному індексі
        System.out.println("2) Result is " + str.charAt(4));

        // Виведення останнього символу рядка
        System.out.println("3) Result is " + str.charAt(str.length() - 1));
    }
}
