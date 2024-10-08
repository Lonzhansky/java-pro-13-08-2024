package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._05_Phaser._01;

import java.util.concurrent.Phaser;

public class Main {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        // Реєстрація певної кількості сторін
        phaser.bulkRegister(3);
        System.out.println("Phase in Main-" +
                phaser.getPhase() + " started");

        // Запуск певної кількості потоків
        for (int i = 0; i < 3; i++) {
            new Thread(
                    new FirstTask("Thread-" + i, phaser))
                    .start();
        }

        int curPhase = phaser.getPhase();

        // Для того, щоб основний (main) потік чекав
        phaser.arriveAndAwaitAdvance();

        System.out.println("Phase in Main-" + curPhase + " completed");


        for (int i = 0; i < 2; i++) {
            new Thread(
                    new SecondTask("Thread-" + i, phaser))
                    .start();
        }
        phaser.arriveAndAwaitAdvance();

        System.out.println("Phase in Main-" + phaser.getPhase() +
                " completed");

        // Відміна реєстрації основного потоку
        phaser.arriveAndDeregister();
    }
}
