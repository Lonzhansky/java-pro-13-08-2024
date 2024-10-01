package ua.hillel.lessons.lesson12.demos._01_Class_Thread._07_interrupted;

public class Main {

    public static void main(String[] args) {

        MyThread01 thread1 = new MyThread01();
        MyThread02 thread2 = new MyThread02();

        thread1.start();
        thread1.interrupt(); // <- перериваємо потік
        thread2.start();
    }
}
