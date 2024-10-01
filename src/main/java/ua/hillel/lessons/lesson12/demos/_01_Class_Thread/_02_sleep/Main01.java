package ua.hillel.lessons.lesson12.demos._01_Class_Thread._02_sleep;

public class Main01 {

    public static void main(String[] args) {
        // Через конструктор зазначаємо ім'я потоку
        MyThread01 thread01 = new MyThread01("Thread 1");
        MyThread01 thread02 = new MyThread01("Thread 2");
        // Стартуємо потоки
        thread01.start();
        thread02.start();
    }
}
