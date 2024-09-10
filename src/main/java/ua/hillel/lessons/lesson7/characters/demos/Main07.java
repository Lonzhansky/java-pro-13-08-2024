package ua.hillel.lessons.lesson7.characters.demos;

// Використовуємо можливості
// класу Character
public class Main07 {

    static char a;
    static boolean isUCase;
    static int code;

    public static void main(String[] args) {

        a = 'Q';
        isUCase = Character.isUpperCase(a);
        System.out.println("1 ) The value " + a +
                " is upper case? " + isUCase);

        a = 'q';
        isUCase = Character.isUpperCase(a);
        System.out.println("2 ) The value " + a +
                " is upper case? " + isUCase);


        code = 81; // ASCII код символа Q
        isUCase = Character.isUpperCase(code);
        System.out.println("3 ) The value code " + code +
                " is upper case? " + isUCase);


        code = 113; // ASCII код символа q
        isUCase = Character.isUpperCase(code);
        System.out.println("4 ) The value code " + code +
                " is upper case? " + isUCase);

    }
}
