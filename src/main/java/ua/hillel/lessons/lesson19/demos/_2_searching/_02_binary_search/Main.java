package ua.hillel.lessons.lesson19.demos._2_searching._02_binary_search;

import ua.hillel.lessons.lesson19.demos._1_sorting.ArrayUtil;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();
        sort(array);

        System.out.println("array: " + Arrays.toString(array));

        System.out.println(binarySearch(array, 34));

    }

    private static int binarySearch(int[] arr, int element) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] < element) {
                low = mid + 1;
            } else if (arr[mid] > element) {
                high = mid - 1;
            } else {
                return mid;
            }

        }


        return -1;
    }


    private static void sort(int[] array) {
        for (int i = 0; i <= array.length - 1 ; i++) {
            int small = i;

            for (int j = small; j <= array.length - 1; j++) {
                if (array[j] < array[small]) {
                    small = j;
                }
            }

            int temp = array[i];
            array[i] = array[small];
            array[small] = temp;

        }
    }
}
