package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._02_CountDownLatch._01;

import java.util.concurrent.CountDownLatch;

class Worker implements Runnable {

    private final CountDownLatch firstLatch;
    private final CountDownLatch secondLatch;

    Worker(CountDownLatch startLatch, CountDownLatch doneLatch) {
        this.firstLatch = startLatch;
        this.secondLatch = doneLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Calling await ...");
            // Не стартує, доки не завершиться налаштування
            firstLatch.await();
            System.out.println("Doing processing " +
                    Thread.currentThread().getName());
            secondLatch.countDown();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
