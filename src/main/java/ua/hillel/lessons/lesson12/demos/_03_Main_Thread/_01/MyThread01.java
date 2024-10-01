package ua.hillel.lessons.lesson12.demos._03_Main_Thread._01;

// Потік, який є дочірнім для головного потоку.
public class MyThread01 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Thread 1 - " + i);
        }
    }
}
