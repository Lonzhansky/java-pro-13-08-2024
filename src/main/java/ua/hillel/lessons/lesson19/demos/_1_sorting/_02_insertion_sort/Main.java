package ua.hillel.lessons.lesson19.demos._1_sorting._02_insertion_sort;

import ua.hillel.lessons.lesson19.demos._1_sorting.ArrayUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = ArrayUtil.getArray();
        System.out.println("before: " + Arrays.toString(array));

        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j  = i - 1;

            while (j >= 0 && key < array[j]) {
                counter++;
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        System.out.println("counter = " + counter);
        System.out.println("after: " + Arrays.toString(array));

    }
}
