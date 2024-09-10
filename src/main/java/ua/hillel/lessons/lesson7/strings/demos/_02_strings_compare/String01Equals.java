package ua.hillel.lessons.lesson7.strings.demos._02_strings_compare;

// equals() порівнює вміст рядка.
// Порівнює рядок із зазначеним об'єктом.
public class String01Equals {

    public static void main(String[] args) {

        String a = "Orange";
        String b = "Orange";
        String c = "Potato";

        // Порівняння a до b
        boolean isEquals = a.equals(b);
        System.out.println("1) The "+ a + " is equals " +
                b + " ? " + isEquals);

        // Порівняння a до с
        isEquals = a.equals(c);
        System.out.println("2) The "+ a + " is equals " +
                c + " ? " + isEquals);
    }
}
