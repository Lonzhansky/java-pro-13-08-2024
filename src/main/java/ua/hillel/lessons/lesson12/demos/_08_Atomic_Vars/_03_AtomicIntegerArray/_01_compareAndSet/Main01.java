package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._03_AtomicIntegerArray._01_compareAndSet;

import java.util.concurrent.atomic.AtomicIntegerArray;

// Метод compareAndSet() атомарно встановлює елемент
// у положення заданого оновленого значення, якщо
// поточне значення дорівнює очікуваному значенню.
// Цей метод набуває значення індексу, очікуване
// значення та значення оновлення у якості параметрів
// і повертає логічне значення, що вказує, чи було
// оновлено значення.
public class Main01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        AtomicIntegerArray atomArr = new AtomicIntegerArray(arr);

        System.out.println("The array : " + atomArr);

        // Індекс, де виконується операція
        int idx = 3;

        // Очікуване значення в індексі
        int expect = 4;

        // Значення для оновлення, якщо поточне значення
        // дорівнює очікуваному значенню
        int update = 25;

        // Оновлення значення в індексі
        atomArr.compareAndSet(idx, expect, update);

        System.out.println("The array after update : " + atomArr);
    }
}
