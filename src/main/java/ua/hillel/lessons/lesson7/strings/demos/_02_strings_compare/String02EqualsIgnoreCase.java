package ua.hillel.lessons.lesson7.strings.demos._02_strings_compare;

// equalsIgnoreCase() порівнює
// рядок з іншим рядком, ігноруючи регістр.
public class String02EqualsIgnoreCase {

    public static void main(String[] args) {

        String a = "Orange";
        String b = "ORANGE";

        // Порівняння a до b
        // без ігнорування регістру
        boolean isEquals = a.equals(b);
        System.out.println("1) The " + a + " is equals " +
                b + " ? " + isEquals);

        // Порівняння a до b
        // з ігноруванням регістру
        isEquals = a.equalsIgnoreCase(b);
        System.out.println("2) The "+ a + " is equals " +
                b + " ? " + isEquals);
    }
}
