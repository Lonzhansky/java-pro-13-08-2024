package ua.hillel.lessons.lesson7.characters.demos;

// Використовуємо можливості
// класу Character
public class Main05 {

    static char a;
    static boolean isDigit;
    static int code;

    public static void main(String[] args) {

        a = 'Q';
        isDigit = Character.isDigit(a);
        System.out.println("1 ) The value " + a +
                " is a digit? " + isDigit);

        code = 81; // ASCII код символа Q
        isDigit = Character.isDigit(code);
        System.out.println("2 ) The value code " + code +
                " is a digit? " + isDigit);

        a = '5';
        isDigit = Character.isDigit(a);
        System.out.println("3 ) The value " + a +
                " is a digit? " + isDigit);

    }
}
