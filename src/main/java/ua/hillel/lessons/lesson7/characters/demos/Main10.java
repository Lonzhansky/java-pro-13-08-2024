package ua.hillel.lessons.lesson7.characters.demos;

// Метод toLowerCase класу Character
// повертає нижній регістр значення.
// Якщо переданий ASCII код значення у верхньому
// регістрі, то буде повернуто його
// ASCII код нижнього регістру.
public class Main10 {

    static char a;
    static char b;
    static int code;
    static int code1;
    static int count;

    public static void main(String[] args) {

        a = 'Q';
        b = Character.toLowerCase(a);
        count++;
        System.out.println(count + ") The value " + a +
                " converted to " + b);


        code = 81; // ASCII код символа Q
        code1 = Character.toLowerCase(code);
        count++;
        System.out.println(count + ") The code " + code +
                " converted to " + code1);


        code = 55; // ASCII код символа 7, цифра
        code1 = Character.toLowerCase(code);
        count++;
        System.out.println(count + ") The code " + code +
                " converted to " + code1);

    }
}
