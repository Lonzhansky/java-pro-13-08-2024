package ua.hillel.lessons.lesson8.demos._02_try_catch_multi;

// Блок try містить два винятки, але одночасно
// виникає тільки один виняток, та виконується
// відповідний йому блок catch.
// Виникає ArithmeticException.
public class Main03 {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];

            arr[5] = 30 / 0;

            System.out.println(arr[10]);

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
