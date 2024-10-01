package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._03_AtomicIntegerArray._02_decrementAndGet;

import java.util.concurrent.atomic.AtomicIntegerArray;

// Метод decrementAndGet() атомарно зменшує
// на одиницю елемент за заданим індексом.
// Цей метод набуває значення індексу та
// значення, що додається в якості параметрів і
// повертає оновлене значення за цим індексом.
public class Main01 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 4, 6};

        AtomicIntegerArray atomArr = new AtomicIntegerArray(arr);

        System.out.println("The array : " + atomArr);

        // Індекс, де виконується операція
        int idx = 2;

        // Оновлення значення в індексі
        atomArr.decrementAndGet(idx);

        System.out.println("The array after update : " + atomArr);
    }
}
