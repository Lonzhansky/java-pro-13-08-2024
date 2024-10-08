package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._05_Phaser._01;

import java.util.concurrent.Phaser;

class FirstTask implements Runnable {

    private final String threadName;
    private final Phaser phaser;

    FirstTask(String threadName, Phaser phaser) {
        this.threadName = threadName;
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("It's First Task.. " + threadName);
        // Сторони будуть чекати тут
        phaser.arriveAndAwaitAdvance();
        System.out.println("De-registering, Phase-" +
                phaser.getPhase() + " completed");
        phaser.arriveAndDeregister();
    }
}
