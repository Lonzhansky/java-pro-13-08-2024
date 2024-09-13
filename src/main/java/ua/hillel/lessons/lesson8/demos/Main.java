package ua.hillel.lessons.lesson8.demos;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];

        try {
            System.out.println(arr[20]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("bad situations");
        }

    }
}
