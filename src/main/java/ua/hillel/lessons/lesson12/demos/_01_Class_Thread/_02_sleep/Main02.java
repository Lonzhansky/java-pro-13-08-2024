package ua.hillel.lessons.lesson12.demos._01_Class_Thread._02_sleep;

public class Main02 {

    public static void main(String[] args) {

        MyThread02 thread01 = new MyThread02("Thread 1");
        MyThread02 thread02 = new MyThread02("Thread 2");

        System.out.println(thread01.getName() +
                " state: " + thread01.getState());
        thread01.start();
        System.out.println(thread01.getName() +
                " state: " + thread01.getState());

        System.out.println(thread02.getName() +
                " state: " + thread02.getState());
        thread02.start();
        System.out.println(thread02.getName() +
                " state: " + thread02.getState());
    }
}
