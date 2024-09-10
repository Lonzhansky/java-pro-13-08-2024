package ua.hillel.lessons.lesson7.strings.demos._02_strings_compare;

// startsWith() — метод, який перевіряє, чи починається рядок
// з певного рядка. Якщо так - повертає true, ні - повератє false.
// Можна також передати індекс першого символу,
// з якого починається перевірка.
// endsWith() - метод, який перевіряє, чи рядок закінчується певним
// заданим рядком. Якщо так - повертає true, ні - повертає false.
// Якщо аргумент методу є порожнім рядком, тоді метод повертає true.
public class String05StartsWithEndsWith {

    static int index;

    public static void main(String[] args) {

        String str = "This orange is tasty";

        System.out.println("1) Initial string: \"" + str + "\"");

        // Перевіряємо, чи починається рядок з переданого аргументу.

        String strPart = "This";
        boolean isStarts = str.startsWith(strPart);
        System.out.println("2) The string starts with \"" + strPart +
                "\" ? " + isStarts);

        strPart = "Those";
        isStarts = str.startsWith(strPart);
        System.out.println("3) The string starts with \"" + strPart +
                "\" ? " + isStarts);

        // Перевіряємо, чи починається підрядок рядка, що починається з
        // вказаного індексу, з переданого аргументу.
        strPart = "orange";
        index = 5;
        isStarts = str.startsWith(strPart, index);
        System.out.println("4) The string starts with \"" + strPart +
                "\" from index " + index + " ? " + isStarts);


        // Перевіряємо, чи закінчується рядок переданим аргументом.

        strPart = "tasty";
        boolean isEnds = str.endsWith(strPart);
        System.out.println("5) The string ends with \"" + strPart +
                "\" ? " + isEnds);


        strPart = "product";
        isEnds = str.endsWith(strPart);
        System.out.println("6) The string ends with \"" + strPart +
                "\" ? " + isEnds);

    }
}
