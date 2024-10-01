package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._01._02A;

public class MyThread01 extends Thread {

    public void run() {
        System.out.println("Thread 1 - AAA");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println("Thread 1 - BBB");
    }
}
