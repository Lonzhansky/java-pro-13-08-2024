package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// trim() - метод, який видаляє будь-які пробіли на початку
// та в кінці рядка (крайні). Якщо рядок містить лише пробіли,
// тоді метод повертає порожній рядок.
public class String15Trim {

    public static void main(String[] args) {

        // Вхідне значення з крайніми пробілами
        String str1 = " Orange  ";
        String strTrimed1 = str1.trim();
        System.out.println("1) Result is " + strTrimed1);

        // Вхідне значення лише з пробілами
        String str2 = "                                  ";
        String strTrimed2 = str2.trim();
        System.out.println("2) Result is " + strTrimed2);

    }
}
