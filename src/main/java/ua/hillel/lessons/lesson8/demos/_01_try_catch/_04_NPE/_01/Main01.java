package ua.hillel.lessons.lesson8.demos._01_try_catch._04_NPE._01;

// Без блоку try-catch виникає NullPointerException
// при зверненні до null об'єкту.
public class Main01 {

    public static void main(String[] args) {
        // Ініціалізація null-ом
        String str = null;
        // Код, який може викликати виняток
        System.out.println("Result is " + str.length());

    }
}
