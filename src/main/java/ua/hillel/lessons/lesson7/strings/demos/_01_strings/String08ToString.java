package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Конвертація примітивного типу даних
// в String через клас-обгортку та метод toString()
public class String08ToString {

    public static void main(String[] args) {

        int i = 587;
        String strInt = Integer.toString(i);
        System.out.println("int -> String: " + strInt);

        float f = 418.129f;
        String strFlt = Float.toString(f);
        System.out.println("float -> String: " + strFlt);

        double d = 49.127;
        String strDbl = Double.toString(d);
        System.out.println("double -> String: " + strDbl);

        boolean b = true;
        String strBol = Boolean.toString(b);
        System.out.println("boolean -> String: " + strBol);

        char c = 'y';
        String strCha = Character.toString(c);
        System.out.println("char -> String: " + strCha);

        long l = 8339234237L;
        String strLng = Long.toString(l);
        System.out.println("long -> String: " + strLng);
    }
}
