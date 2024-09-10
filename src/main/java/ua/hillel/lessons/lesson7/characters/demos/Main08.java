package ua.hillel.lessons.lesson7.characters.demos;

// Використовуємо можливості
// класу Character
public class Main08 {

    static char a;
    static boolean isLCase;
    static int code;
    static int count;

    public static void main(String[] args) {

        a = 'Q';
        isLCase = Character.isLowerCase(a);
        count++;
        System.out.println(count + ") The value " + a +
                " is lower case? " + isLCase);

        a = 'q';
        isLCase = Character.isLowerCase(a);
        count++;
        System.out.println(count + ") The value " + a +
                " is lower case? " + isLCase);


        code = 81; // ASCII код символа Q
        isLCase = Character.isLowerCase(code);
        count++;
        System.out.println(count + ") The value code " + code +
                " is lower case? " + isLCase);


        code = 113; // ASCII код символа q
        isLCase = Character.isLowerCase(code);
        count++;
        System.out.println(count + ") The value code " + code +
                " is lower case? " + isLCase);

    }
}
