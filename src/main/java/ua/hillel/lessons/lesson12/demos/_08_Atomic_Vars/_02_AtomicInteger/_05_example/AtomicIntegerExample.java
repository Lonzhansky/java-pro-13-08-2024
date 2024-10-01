package ua.hillel.lessons.lesson12.demos._08_Atomic_Vars._02_AtomicInteger._05_example;

public class AtomicIntegerExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Створення декількох потоків
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment(); // Інкрементування лічильника
                }
            });
        }

        // Запуск усіх потоків
        for (Thread thread : threads) {
            thread.start();
        }

        // Очікування завершення всіх потоків
        for (Thread thread : threads) {
            thread.join();
        }

        // Виведення остаточного значення лічильника
        System.out.println("Кінцеве значення лічильника: " + counter.getCount());
    }
}