package ua.hillel.lessons.lesson7.strings.demos._01_strings;

// Конкатенація (об'єднання) рядків.
public class String01Concat {

    public static void main(String[] args) {

        String strA = "Just an app";
        System.out.println(strA);

        // Конкатенація через символ +
        String strB = "Very long row of our text, "
                + "it's must be concatenated, "
                + "that's why look for spaces.";
        System.out.println(strB);

        // Конкатенація через метод concat()
        String strC = "Just ";
        String strD = strC.concat("a row");
        System.out.println(strD);

        // Конкатенація ланцюжком через метод concat()
        System.out.println("Just".concat(" ").concat("a row"));

        // Дізнаємося довжину рядка через метод length()
        String strE = "Our text!";
        System.out.println("Row length is " + strE.length());

    }
}
