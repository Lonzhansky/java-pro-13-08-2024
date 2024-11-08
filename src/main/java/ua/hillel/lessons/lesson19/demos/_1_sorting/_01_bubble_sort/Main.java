package ua.hillel.lessons.lesson19.demos._1_sorting._01_bubble_sort;

import ua.hillel.lessons.lesson19.demos._1_sorting.ArrayUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();
        System.out.println("before: " + Arrays.toString(array));

        int counter = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("after: " + Arrays.toString(array));

        System.out.println("counter = " + counter);

    }
}
