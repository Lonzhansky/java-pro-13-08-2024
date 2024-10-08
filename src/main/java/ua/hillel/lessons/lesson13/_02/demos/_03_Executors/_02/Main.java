package ua.hillel.lessons.lesson13._02.demos._03_Executors._02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// FixedThreadPool виконавець з кількістю потоків 3.
public class Main {

    public static void main(String[] args) {
        try (ExecutorService executorService =
                     Executors.newFixedThreadPool(3)) {
            for (int j = 1; j <= 3; j++) {
                Runnable task = new MyWorker("" + j);
                executorService.execute(task);
            }
            executorService.shutdown();
        }
    }
}
