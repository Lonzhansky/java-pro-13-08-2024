package ua.hillel.lessons.lesson12.demos._02_Thread_Priorities._02;

public class Main {

    public static void main(String[] args) {
        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02();
        MyThread03 thread03 = new MyThread03();

        thread01.start();
        thread02.start();
        thread03.start();
    }
}
