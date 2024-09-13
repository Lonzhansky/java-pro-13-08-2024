package ua.hillel.lessons.lesson8.demos._01_try_catch._03_num_frm_ex;

// Без блоку try-catch виникає NumberFormatException.
// Неможливо перетворити рядок на число.
public class Main01 {

    static int num;

    public static void main(String[] args) {

        // Код, який може викликати виняток
//        num = Integer.parseInt("five");

        // Помилка компіляції
//        num = Integer.parseInt(5);

        // Код, який не викликає виняток
        num = Integer.parseInt("5");

        System.out.println("Result is " + num);
    }
}
