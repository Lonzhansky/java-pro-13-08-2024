package ua.hillel.lessons.lesson13._01.demos._01_Synchronization._01;

public class Main {
    public static void main(String[] args) {

        DataHandler dataHandler = new DataHandler();

        Thread1 thread1 = new Thread1(dataHandler);
        Thread2 thread2 = new Thread2(dataHandler);
        Thread3 thread3 = new Thread3(dataHandler);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
