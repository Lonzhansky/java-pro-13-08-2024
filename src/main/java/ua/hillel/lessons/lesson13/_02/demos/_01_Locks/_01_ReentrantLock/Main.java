package ua.hillel.lessons.lesson13._02.demos._01_Locks._01_ReentrantLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new WorkerThread(sharedResource);
        Thread t2 = new WorkerThread(sharedResource);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + sharedResource.getCounter());
    }
}