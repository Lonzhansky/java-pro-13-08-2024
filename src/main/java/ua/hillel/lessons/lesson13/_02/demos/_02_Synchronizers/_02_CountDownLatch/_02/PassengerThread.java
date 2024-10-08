package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._02_CountDownLatch._02;

import java.util.concurrent.CountDownLatch;

class PassengerThread implements Runnable {

    private final String name;
    // Час прибуття пасажира до пристані,
    // де пришвартований човен
    private final int timeToGetPier;
    private final CountDownLatch latch;

    public PassengerThread(String name, int timeToGetPier, CountDownLatch latch) {
        this.name = name;
        this.timeToGetPier = timeToGetPier;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeToGetPier);
        } catch (InterruptedException ex) {
            System.err.println("Exception: " + ex.getMessage());
        }
        System.out.println(name + " in the boat.");
        // Зменшуємо лічильник CountDownLatch на 1
        latch.countDown();
    }
}
