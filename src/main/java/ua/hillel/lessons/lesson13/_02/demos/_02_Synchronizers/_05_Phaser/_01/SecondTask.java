package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._05_Phaser._01;

import java.util.concurrent.Phaser;

class SecondTask implements Runnable {

    private final String threadName;
    private final Phaser phaser;

    SecondTask(String threadName, Phaser phaser){
        this.threadName = threadName;
        this.phaser = phaser;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println("It's SecondTask.. " + threadName);
        phaser.arriveAndAwaitAdvance();
        System.out.println("It's SecondTask.. Phase-" +
                phaser.getPhase() + " completed " + threadName);
        phaser.arriveAndDeregister();
    }
}
