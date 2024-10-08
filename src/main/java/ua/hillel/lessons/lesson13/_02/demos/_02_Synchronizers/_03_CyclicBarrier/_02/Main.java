package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._03_CyclicBarrier._02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {

        List<Integer> dataList =
                Collections.synchronizedList(new ArrayList<>());

        // Ініціалізація CyclicBarrier
        // значенням 4, яке відрізняється
        // від кількості потоків, що запускаються
        CyclicBarrier cb =
                new CyclicBarrier(4, new BarrierAction(dataList));

        // Запуск N потоків
        for (int i = 0; i < 3; i++) {
            new Thread(new Worker(dataList, cb)).start();
        }
        try {
            // Виклик await для головного (main) потоку
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("Done with initial set of threads, " +
                "starting again reusing the same CyclicBarrier object");

        dataList = Collections.synchronizedList(new ArrayList<>());

        // Запуск іншого набору потоків
        for (int i = 0; i < 3; i++) {
            new Thread(new Worker(dataList, cb)).start();
        }

        try {
            // Виклик await для головного (main) потоку
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("It's main thread...");
    }
}
