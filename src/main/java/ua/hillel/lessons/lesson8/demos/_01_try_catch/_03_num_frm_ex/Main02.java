package ua.hillel.lessons.lesson8.demos._01_try_catch._03_num_frm_ex;

// Без блоку try-catch виникає NumberFormatException.
// Неможливо перетворити рядок на число.
public class Main02 {

    static int num;

    public static void main(String[] args) {

        try {
            // Код, який може викликати виняток
            num = Integer.parseInt("five");
            // Код, який не викликає виняток
//            num = Integer.parseInt("5") ;
        } catch(NumberFormatException nfe) {
            // Обробка винятку
            System.out.println("Not a number!");
//            System.out.println(nfe.getMessage());
            // Трасування стеку
//            nfe.printStackTrace();
        }

        System.out.println("Result is " + num);
    }
}
