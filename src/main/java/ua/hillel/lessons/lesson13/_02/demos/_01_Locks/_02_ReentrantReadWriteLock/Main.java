package ua.hillel.lessons.lesson13._02.demos._01_Locks._02_ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread reader1 = new ReaderThread(sharedResource);
        Thread reader2 = new ReaderThread(sharedResource);
        Thread writer = new WriterThread(sharedResource);

        reader1.start();
        reader2.start();
        writer.start();

        try {
            reader1.join();
            reader2.join();
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + sharedResource.readCounter());
    }
}
