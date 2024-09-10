package ua.hillel.lessons.lesson7.strings.demos._02_strings_compare;

// compareTo() порівнює значення лексикографічно та
// Повертає ціле значення, яке описує, якщо перший рядок
// менше, дорівнює або більше другого рядка.
public class String03CompareTo {

    public static void main(String[] args) {

        String a = "Kiwi";
        String b = "Kiwi";
        String c = "Potato";

        // Порівняння a до b
        int res = a.compareTo(b);
        System.out.println("1) The result is " + res);

        // Порівняння a до c
        res = a.compareTo(c);
        System.out.println("2) The result is " + res);

        // Порівняння c до a
        res = c.compareTo(a);
        System.out.println("3) The result is " + res);
    }
}
