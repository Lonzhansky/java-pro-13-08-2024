package ua.hillel.lessons.lesson19.demos._2_searching._01_linear_search;

import ua.hillel.lessons.lesson19.demos._1_sorting.ArrayUtil;

public class Main {

    public static void main(String[] args) {
        int[] array = ArrayUtil.getArray();
        System.out.println(search(array, 54));
    }

    private static int search(int[] arr, int element) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }

}
