package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._02;

public class Main01 {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        // Виклик Thread.start для запуску нового потоку
        mt.start();
    }
}
