package ua.hillel.lessons.lesson13._02.demos._03_Executors._02;

public class MyWorker implements Runnable {

    String threadNo;

    public MyWorker(String threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " start execution. Thread - " + threadNo);


        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(Thread.currentThread().getName() +
                " stop execution.");
    }
}
