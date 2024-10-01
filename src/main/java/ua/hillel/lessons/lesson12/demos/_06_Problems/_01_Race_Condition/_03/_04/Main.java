package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._03._04;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread( "Tom", 1);
        MyThread t2 = new MyThread("Alice", 1);

        // Старт потоків
        t1.start();
        t2.start();
    }
}
