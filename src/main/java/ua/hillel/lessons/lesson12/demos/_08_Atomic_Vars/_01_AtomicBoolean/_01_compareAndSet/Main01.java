package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._01_AtomicBoolean._01_compareAndSet;

import java.util.concurrent.atomic.AtomicBoolean;

// Метод compareAndSet(boolean expect, boolean update)
// атомарно встановлює значення на задане оновлене значення,
// якщо поточне значення дорівнює (==) очікуваному значенню.
public class Main01 {

    public static void main(String[] args) {
        // Можемо встановити значення в конструкті
        AtomicBoolean val = new AtomicBoolean(true);
        System.out.println("Initial value is " + val);
        // Перевіряємо, чи було попереднє значення true,
        // а потім оновлюємо його.
        // Якщо змінити порівнюване значення, оновлення не буде.
        boolean res = val.compareAndSet(true, false);
        if (res) {
            System.out.println("Updated value is " + val);
        } else {
            System.out.println("The value was not updated");
        }
    }
}
