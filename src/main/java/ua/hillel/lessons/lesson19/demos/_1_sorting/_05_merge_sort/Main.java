package ua.hillel.lessons.lesson19.demos._1_sorting._05_merge_sort;

import ua.hillel.lessons.lesson19.demos._1_sorting.ArrayUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = ArrayUtil.getArray();
        System.out.println("before: " + Arrays.toString(array));
        array = mergeSort(array, 0, array.length - 1);
        System.out.println("after: " + Arrays.toString(array));

    }

    private static int[] mergeSort(int[] arr, int low, int hight) {

        if (low < hight) {
            int mid = (low + hight) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, hight);

            merge(arr, low, mid, hight);
        }
        return arr;
    }


    private static void merge(int[] subArr, int low, int mid, int hight) {
        int n = hight - low + 1;

        int[] temp = new int[n];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid || j <= hight) {
            if (i > mid) {
                temp[k++] = subArr[j++];
            } else if (j > hight) {
                temp[k++] = subArr[i++];
            } else if (subArr[i] < subArr[j]) {
                temp[k++] = subArr[i++];
            } else {
                temp[k++] = subArr[j++];
            }
        }
        for (j = 0; j < n; j++) {
            subArr[low + j] = temp[j];
        }
    }
}
