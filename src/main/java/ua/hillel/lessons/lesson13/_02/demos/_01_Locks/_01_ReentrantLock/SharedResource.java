package ua.hillel.lessons.lesson13._02.demos._01_Locks._01_ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();
    private int counter = 0;

    public void increment() {
        lock.lock();  // Захоплюємо блокування
        try {
            // Критична секція, яка повинна бути доступна тільки одному потоку одночасно
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        } finally {
            lock.unlock();  // Розблоковуємо
        }
    }

    public int getCounter() {
        return counter;
    }
}
