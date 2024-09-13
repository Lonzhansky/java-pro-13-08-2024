package ua.hillel.lessons.lesson8.demos._02_try_catch_multi;

// ArrayIndexOutOfBounds
public class Main02 {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            System.out.println(arr[8]);
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
