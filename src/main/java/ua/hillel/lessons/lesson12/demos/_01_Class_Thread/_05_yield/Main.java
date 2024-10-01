package ua.hillel.lessons.lesson12.demos._01_Class_Thread._05_yield;

// MyThread02 потік отримає більше шансів виконання.
// Тому що MyThread01 потік викликає метод yield().
public class Main {

    public static void main(String[] arg) {
        MyThread01 thread1 = new MyThread01();
        MyThread02 thread2 = new MyThread02();
        thread1.start();
        thread2.start();
    }
}
