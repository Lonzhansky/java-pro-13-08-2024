package ua.hillel.lessons.lesson13._02.demos._03_Executors._04;

import java.util.Date;

public class MyWorker implements Runnable {

    private final String task;

    public MyWorker(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Start Time for " + task + " " + new Date());
        // Обробляємо задачу тут
        try {
            Thread.sleep(2000); // Обробка задачі займає 2 секунди
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() +
                " End Time for " + task + " " + new Date());
    }


}
