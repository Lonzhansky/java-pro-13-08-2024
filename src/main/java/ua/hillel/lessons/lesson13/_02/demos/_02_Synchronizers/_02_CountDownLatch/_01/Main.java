package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._02_CountDownLatch._01;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
        CountDownLatch firstLatch = new CountDownLatch(1);
        // Лічильник дорівнює 3
        CountDownLatch secondLatch = new CountDownLatch(3);
        // Кількість створених потоків дорівнює 3
        for(int i = 0; i < 3; i++) {
            new Thread(new Worker(firstLatch, secondLatch)).start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Main thread - Doing setup");

        // Сигнал із основного потоку для запуску інших потоків
        firstLatch.countDown();

        try {
            // Основний потік очікує завершення інших потоків
            secondLatch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Main thread - Proceed after all " +
                "the threads are done");
    }
}
