package ua.hillel.lessons.lesson19.demos._1_sorting._03_selection_sort;

import ua.hillel.lessons.lesson19.demos._1_sorting.ArrayUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] array = ArrayUtil.getArray();
        System.out.println("before: " + Arrays.toString(array));

        int counter = 0;


        for (int i = 0; i <= array.length - 1 ; i++) {
            int small = i;

            for (int j = small; j <= array.length - 1; j++) {
                counter++;
                if (array[j] < array[small]) {
                    small = j;
                }
            }

            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;

        }

        System.out.println("after: " + Arrays.toString(array));

        System.out.println("counter = " + counter);

    }
}
