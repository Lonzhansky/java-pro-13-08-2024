package ua.hillel.lessons.lesson8.demos._01_try_catch._04_NPE._01;

// Без блоку try-catch виникає NullPointerException
// при зверненні до null об'єкту.
public class Main02 {

    public static void main(String[] args) {

        String str;

        try {
            // Ініціалізація null-ом
            str = null;
            // Код, який може викликати виняток
            System.out.println(str.length());
        } catch (NullPointerException npe) {
            System.out.println("Exeption: " + npe.getMessage());
            // Або кастомне повідомлення про виняток
//            System.out.println("NULL object!");
        }
    }
}
