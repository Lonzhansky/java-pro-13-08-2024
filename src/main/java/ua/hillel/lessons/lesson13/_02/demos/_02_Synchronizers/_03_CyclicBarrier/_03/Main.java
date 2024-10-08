package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._03_CyclicBarrier._03;

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {

        // Створюємо CyclicBarrier (контрольну точку)
        // з N потоками, яким необхідно викликати await().
        // Кожен потік асоціюється з окремим авто.
        final CyclicBarrier checkPoint =
                new CyclicBarrier(3, new CheckpointThread());

        // Створюємо потоки
        Thread auto1 = new Thread(new AutoThread(checkPoint), "Auto 1");
        Thread auto2 = new Thread(new AutoThread(checkPoint), "Auto 2");
        Thread auto3 = new Thread(new AutoThread(checkPoint), "Auto 3");

        // Запускаємо кожен потік
        auto1.start();
        auto2.start();
        auto3.start();
    }
}
