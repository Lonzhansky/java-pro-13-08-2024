package ua.hillel.lessons.lesson8.demos._02_try_catch_multi;

// ArithmeticException
public class Main01 {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[5] = 30 / 0;
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
