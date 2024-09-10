package ua.hillel.lessons.lesson7.characters.demos;

// Метод toUpperCase класу Character
// повертає верхній регістр значення.
// Якщо переданий ASCII код значення у нижньому
// регістрі, то буде повернуто його
// ASCII код верхнього регістру.
public class Main09 {

    static char a;
    static char b;
    static int code;
    static int code1;
    static int count;

    public static void main(String[] args) {

        a = 'q';
        b = Character.toUpperCase(a);
        count++;
        System.out.println(count + ") The value " + a +
                " converted to " + b);


        code = 113; // ASCII код символа q
        code1 = Character.toUpperCase(code);
        count++;
        System.out.println(count + ") The code " + code +
                " converted to " + code1);

        code = 55; // ASCII код символа 7, цифра
        code1 = Character.toUpperCase(code);
        count++;
        System.out.println(count + ") The code " + code +
                " converted to " + code1);

    }
}
