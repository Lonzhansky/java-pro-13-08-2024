package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._03_AtomicIntegerArray._03_getAndAdd;

import java.util.concurrent.atomic.AtomicIntegerArray;

// Метод getAndAdd() атомарно додає задане значення
// до елементу за індексом AtomicIntegerArray.
// Цей метод набуває значення індексу AtomicIntegerArray
// і значення, що додається в якості параметрів і повертає
// значення перед операцією додавання.
public class Main01 {

    public static void main(String[] args) {

        int[] arr = {8, 12, 25, 9, 5};

        AtomicIntegerArray atomArr = new AtomicIntegerArray(arr);

        System.out.println("The array : " + atomArr);

        // Індекс, де виконується операція
        int idx = 2;

        // Значення для додавання в індексі
        int x = 5;

        // Оновлення значення в індексі
        int prev = atomArr.getAndAdd(idx, x);

        System.out.println("Value at index " + idx
                + " before update is " + prev);

        System.out.println("The array after update : "
                + atomArr);
    }
}
