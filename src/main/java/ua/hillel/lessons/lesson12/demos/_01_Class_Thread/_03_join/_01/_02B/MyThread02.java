package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._01._02B;

public class MyThread02 extends Thread {

    public void run() {
        System.out.println("Thread 2 - AAA ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println("Thread 2 - BBB ");
    }
}
