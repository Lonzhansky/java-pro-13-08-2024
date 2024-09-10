package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// repeat() використовується для повторення рядка
// у вказаний час.
// Він повертає рядок, значення якого є конкатенацією
// цього рядка, повтореного заданими разами.
public class String17Repeat {

    public static void main(String[] args) {

        String strA = "O_O";
        // Виведення один раз
        System.out.println("1) " + strA);
        // Виведення 4-и рази
        String repStrA = strA.repeat(4);
        System.out.println("2) " + repStrA);

        String strB = "orange|";
        // Виведення один раз
        System.out.println("3) " + strB);
        // Виведення 3-и рази
        String repStrB = strB.repeat(3);
        System.out.println("4) " + repStrB);
    }
}
