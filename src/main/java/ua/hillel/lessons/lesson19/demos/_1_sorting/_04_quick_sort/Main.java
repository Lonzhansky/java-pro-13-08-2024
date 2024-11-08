package ua.hillel.lessons.lesson19.demos._1_sorting._04_quick_sort;

import ua.hillel.lessons.lesson19.demos._1_sorting.ArrayUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();
        System.out.println("before: " + Arrays.toString(array));
        quickSort(array, 0 , array.length - 1);
        System.out.println("after: " + Arrays.toString(array));

    }

    private static void quickSort(int[] arr, int low, int hight) {
        if (low < hight) {
            int p = partition(arr, low, hight);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, hight);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];

        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i, left);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
