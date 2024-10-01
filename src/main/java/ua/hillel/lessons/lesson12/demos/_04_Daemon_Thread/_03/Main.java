package ua.hillel.lessons.lesson12.demos._04_Daemon_Thread._03;

// Потоки, створені в іншому потоці (тут - головний потік),
// можут набути приорітет потоку, який встановлено для
// батьківського потоку.
public class Main {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.setDaemon(true);
        thread3.start();
    }
}
