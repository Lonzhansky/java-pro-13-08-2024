package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._03_CyclicBarrier._03;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class AutoThread implements Runnable {

    private final CyclicBarrier checkPoint;

    public AutoThread(CyclicBarrier checkPoint) {
        this.checkPoint = checkPoint;
    }

    // Виконується для кожного потоку
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() +
                    " has left point A.");

            checkPoint.await();
            System.out.println(Thread.currentThread().getName() +
                    " has left checkpoint/barrier # 1.");

            checkPoint.await();
            System.out.println(Thread.currentThread().getName() +
                    " has left checkpoint/barrier # 2.");

            checkPoint.await();
            System.out.println(Thread.currentThread().getName() +
                    " has reached point B.");

        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e.getMessage());
        }
    }
}
