package ua.hillel.lessons.lesson13._02.demos._03_Executors._01;

public class MyWorker implements Runnable {

    private final String task;

    MyWorker(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Executing " + task + " with " +
                    Thread.currentThread().getName());
        }
        System.out.println();
    }
}
