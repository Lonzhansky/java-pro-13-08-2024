package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._04;

// Реалізація інтерфейсу Runnable через лямбду.
// Це можливо, тому що інтерфейс Runnable
// має лише один абстрактний метод і,
// отже, є функціональним інтерфейсом Java.
public class Main01 {

    public static void main(String[] args) {
        Runnable myRunnable = () -> System.out.println("Lambda Runnable running");
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
