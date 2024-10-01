package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._02_AtomicInteger._03_decrementAndGet;

import java.util.concurrent.atomic.AtomicInteger;

// Метод decrementAndGet() зменшує попереднє значення
// на одиницю та повертає значення після оновлення,
// що має тип даних int.
public class Main01 {

    public static void main(String[] args) {
        AtomicInteger val = new AtomicInteger(8);
        System.out.println("Initial value is " + val);
        int res = val.decrementAndGet();
        System.out.println("Updated value is " + res);
    }
}
