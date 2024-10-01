package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._02_AtomicInteger._05_example;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private final AtomicInteger count = new AtomicInteger(0); // Ініціалізація AtomicInteger
//    private int count = 0;

    // Метод для інкременту лічильника
    public void increment() {
        count.incrementAndGet(); // Атомарне інкрементування
//        count++;
    }

    // Метод для отримання значення лічильника
    public int getCount() {
        return count.get(); // Отримання значення без зміни
//        return count;
    }
}
