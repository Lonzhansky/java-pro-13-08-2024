package ua.hillel.lessons.lesson13._02.demos._03_Executors._04;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// ScheduledExecutor виконавець.
//
// Метод newScheduledThreadPool() створює пул потоків,
// який може планувати виконання завдань після заданої
// затримки чи через регулярні проміжки часу.
//
// Цей метод повертає ScheduledExecutorService.
// Існують методи для планування завдань у такому пулі потоків:
// schedule(), scheduleAtFixedRate() та scheduleWithFixedDelay().
//
// Метод schedule() приймає аргументи:
// завдання, затримку та проміжок часу затримки.
//
// Метод schedule() використовується для планування задачі
// після фіксованої затримки.
//
// Метод scheduleAtFixedRate() використовується для планування
// завдання після фіксованої затримки та наступного періодичного
// виконання цього завдання.
//
// Метод scheduleWithFixedDelay() використовується для планування
// завдання після початкової затримки, а потім виконання завдань з
// фіксованою затримкою після завершення попереднього завдання.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current Time = " + new Date());
        try (ScheduledExecutorService scheduledThreadPool =
                     Executors.newScheduledThreadPool(3)) {
            for (int i = 1; i <= 5; i++) {
                MyWorker task = new MyWorker("Task " + i);
                // Завдання запускається через 5 секунд
//                scheduledThreadPool.schedule(task, 5, TimeUnit.SECONDS);

//                // Завдання запускається через 2 секунди і повторюється кожні 5 секунд
                scheduledThreadPool.scheduleAtFixedRate(task, 2, 5, TimeUnit.SECONDS);

                // Завдання запускається через 2 секунди після старту
                // Після завершення кожного завдання починається нове із затримкою 5 секунд
//                scheduledThreadPool.scheduleWithFixedDelay(task, 2, 5, TimeUnit.SECONDS);
            }

//            Thread.sleep(10000);

            scheduledThreadPool.shutdown();
        }
        System.out.println("Completed all threads");
    }
}
