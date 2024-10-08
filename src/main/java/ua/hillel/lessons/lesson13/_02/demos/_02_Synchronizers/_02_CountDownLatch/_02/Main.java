package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._02_CountDownLatch._02;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(5);
        Thread thread1 = new Thread(new PassengerThread("Passenger 1", 1000, latch));
        Thread thread2 = new Thread(new PassengerThread("Passenger 2", 1500, latch));
        Thread thread3 = new Thread(new PassengerThread("Passenger 3", 1200, latch));
        Thread thread4 = new Thread(new PassengerThread("Passenger 4", 1500, latch));
        Thread thread5 = new Thread(new PassengerThread("Passenger 5", 1350, latch));
        // Окремі потоки імітують рух пасажирів
        // до пірсу, де пришвартований човен.
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        // Човен не відпливає доки всі місця не зайняті
        try {
            // Очікуємо завершення CountDownLatch
            latch.await();
            System.out.println("Passengers are in the boat. The boat is leaving.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
