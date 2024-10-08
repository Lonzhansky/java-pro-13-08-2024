package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._03_CyclicBarrier._01;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Worker implements Runnable {

    private final CyclicBarrier cb;
    private final List<Integer> dataList;

    Worker(List<Integer> dataList, CyclicBarrier cb) {
        this.dataList = dataList;
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println("Executing run method for thread - " +
                Thread.currentThread().getName());

        for (int i = 0; i < 6; i++) {
            dataList.add(i);
        }

        try {
            System.out.println("Calling await.. " +
                    Thread.currentThread().getName());
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e.getMessage());
        }
    }
}
