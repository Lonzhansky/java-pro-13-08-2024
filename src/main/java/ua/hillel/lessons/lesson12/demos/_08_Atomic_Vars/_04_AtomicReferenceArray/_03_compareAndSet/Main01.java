package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._04_AtomicReferenceArray._03_compareAndSet;

import java.util.concurrent.atomic.AtomicReferenceArray;

// Метод compareAndSet() класу AtomicReferenceArray
// використовується для атомарного встановлення значення індексу i
// об'єкта AtomicReferenceArray у нове значення, якщо поточне
// значення індексу i об'єкта AtomicReferenceArray дорівнює очікуваному
// значенню.
// Цей метод поверне значення true, якщо оновлення пройшло успішно.
public class Main01 {

    public static void main(String[] args) {

        AtomicReferenceArray<String> arr
                = new AtomicReferenceArray<>(3);

        arr.set(0, "orange");
        arr.set(1, "banana");
        arr.set(2, "apple");

        boolean op1 = arr.compareAndSet(0, "orange",
                "kiwi");

        boolean op2 = arr.compareAndSet(1, "orange",
                "strawberry");

        System.out.println("Operation at index 0: "
                + op1);
        System.out.println("New value at index 0: "
                + arr.get(0));
        System.out.println("Operation at index 1: "
                + op2);
        System.out.println("New value at index 1: "
                + arr.get(1));
    }
}
