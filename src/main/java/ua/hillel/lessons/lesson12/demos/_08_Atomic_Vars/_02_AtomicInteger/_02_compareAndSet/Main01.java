package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._02_AtomicInteger._02_compareAndSet;

import java.util.concurrent.atomic.AtomicInteger;

// Метод compareAndSet(int expect, int update) встановлює
// значення у передане значення у параметрі, якщо поточне
// значення дорівнює очікуваному значенню, яке також
// передається в параметрі.
// Функція повертає логічне значення, що дає
// уявлення про те, було оновлення виконано чи ні.
public class Main01 {

    public static void main(String[] args) {
        // Можемо встановити значення в конструкті
        AtomicInteger val = new AtomicInteger(0);
        System.out.println("Initial value is " + val);
        // Перевіряємо, чи було попереднє значення 0,
        // а потім оновлюємо його.
        // Якщо змінити порівнюване значення, оновлення не буде.
        boolean res = val.compareAndSet(0, 5);
        if (res) {
            System.out.println("Updated value is " + val);
        } else {
            System.out.println("The value was not updated");
        }
    }
}
