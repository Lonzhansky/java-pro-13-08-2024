package ua.hillel.lessons.lesson12.demos._01_Class_Thread._06_interrupt._01;

public class MyThread02 extends Thread {

    public void run() {
        try {
            for (int i = 1; i < 4; i++) {
                System.out.println("Thread 2 - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 interrupted.");
        }
    }
}
