package ua.hillel.lessons.lesson8.demos._02_try_catch_multi;

// Генеруємо NullPointerException,
// але не надаємо відповідний тип винятку.
// У цьому разі буде викликано блок catch,
// який містить Exception, батьківський клас
// винятку.
public class Main04 {

    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException has occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds has occurred.");
        } catch (Exception e) {
            System.out.println("Exception has occurred.");
        }

        System.out.println("Further down the code...");
    }
}
