package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._02_AtomicInteger._01_addAndGet;

import java.util.concurrent.atomic.AtomicInteger;

// Метод addAndGet(int delta) атомарно додає
// задане значення до поточного значення.
// Повертає оновлене значення.
public class Main {

    public static void main(String[] args) {
        // Можемо встановити значення в конструкті
        AtomicInteger val = new AtomicInteger(2);
        System.out.println("Initial value is " + val);
        int res = val.addAndGet(5);
        System.out.println("Updated value is " + res);
    }
}
