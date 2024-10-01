package ua.hillel.lessons.lesson12.demos._01_Class_Thread._05_yield;

public class MyThread02 extends Thread {

    public void run() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println("Thread 2, count is " + count);
        }
    }
}
