package ua.hillel.lessons.lesson7.characters.demos;

// Використовуємо можливості
// класу Character
public class Main04 {

    static char a;
    static boolean isLetter;
    static int code;

    public static void main(String[] args) {

        a = 'Q';
        isLetter = Character.isLetter(a);
        System.out.println("1 ) The value " + a +
                " is a letter? " + isLetter);

        code = 81; // ASCII код символа Q
        isLetter = Character.isLetter(code);
        System.out.println("2 ) The value code " + code +
                " is a letter? " + isLetter);

        a = '5';
        isLetter = Character.isLetter(a);
        System.out.println("3 ) The value " + a +
                " is a letter? " + isLetter);
    }
}
