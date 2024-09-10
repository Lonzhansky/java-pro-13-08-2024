package ua.hillel.lessons.lesson7.characters.demos;

// Метод isWhitespace класу Character
// визначає, чи є значення пробілом (Whitespace).
// Whitespace: пробіл, табуляція, переведення на новий рядок.
public class Main06 {

    static char a;
    static boolean isWSp;
    static int code;

    public static void main(String[] args) {

        a = 'Q';
        isWSp = Character.isWhitespace(a);
        System.out.println("1 ) The value " + a +
                " is a space? " + isWSp);

        a = ' ';
        isWSp = Character.isWhitespace(a);
        System.out.println("2 ) The value " + a +
                " is a space? " + isWSp);

        a = '\t';
        isWSp = Character.isWhitespace(a);
        System.out.println("3 ) The value \\t is a space? " + isWSp);


        code = 9; // ASCII код горизонтальної табуляциї (HT, \t )
        isWSp = Character.isWhitespace(code);
        System.out.println("4 ) The value code " + code +
                " is a space? " + isWSp);

        a = '\n';
        isWSp = Character.isWhitespace(a);
        System.out.println("5 ) The value \\n is a space? " + isWSp);


        code = 10; // ASCII код переведення рядку (LF, \n )
        isWSp = Character.isWhitespace(code);
        System.out.println("6 ) The value code " + code +
                " is a space? " + isWSp);

    }
}
