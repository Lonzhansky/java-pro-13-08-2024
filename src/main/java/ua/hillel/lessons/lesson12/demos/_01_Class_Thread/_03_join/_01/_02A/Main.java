package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._01._02A;

// Без використання метода join().
// Якщо запускаємо потік без використання методу join(),
// виконання потоку неможливо передбачити.
// Планувальник потоків планує виконання потоку.
public class Main {

    public static void main(String[] args) {
        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02();
        thread01.start();
        thread02.start();
    }
}
