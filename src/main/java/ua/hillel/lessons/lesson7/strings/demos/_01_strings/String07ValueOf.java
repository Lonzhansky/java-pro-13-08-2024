package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Конвертація примітивного типу даних
// у String через метод valueOf()
public class String07ValueOf {

    public static void main(String[] args) {

        int i = 125;
        String strInt = String.valueOf(i);
        System.out.println("int -> String: " + strInt);

        float f = 16.90f;
        String strFlt = String.valueOf(f);
        System.out.println("float -> String: " + strFlt);

        double d = 148.99987;
        String strDbl = String.valueOf(d);
        System.out.println("double -> String: " + strDbl);

        boolean b = false;
        String strBol = String.valueOf(b);
        System.out.println("boolean -> String: " + strBol);

        char c = 'a';
        String strCha = String.valueOf(c);
        System.out.println("char -> String: " + strCha);

        long l = 5284264L;
        String strLng = String.valueOf(l);
        System.out.println("long -> String: " + strLng);
    }
}
