package ua.hillel.lessons.lesson13._02.demos._01_Locks._02_ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int counter = 0;

    // Метод для читання даних (не блокує інші потоки на читання)
    public int readCounter() {
        lock.readLock().lock();  // Блокування для читання
        try {
            System.out.println(Thread.currentThread().getName() + " is reading counter: " + counter);
            return counter;
        } finally {
            lock.readLock().unlock();  // Розблоковуємо
        }
    }

    // Метод для оновлення даних (блокує всі потоки на час запису)
    public void writeCounter(int value) {
        lock.writeLock().lock();  // Блокування для запису
        try {
            System.out.println(Thread.currentThread().getName() + " is writing counter to: " + value);
            this.counter = value;
        } finally {
            lock.writeLock().unlock();  // Розблоковуємо
        }
    }
}