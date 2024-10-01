package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._01._02B;

// Використання метода join().
// Якщо запускаємо потік без використання методу join(),
// виконання потоку неможливо передбачити.
// Планувальник потоків планує виконання потоку.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02();
        thread01.start();
        thread01.join();
        thread02.start();
    }
}
