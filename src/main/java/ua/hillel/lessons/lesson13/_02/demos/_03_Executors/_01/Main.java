package ua.hillel.lessons.lesson13._02.demos._03_Executors._01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// SingleThreadExecutor виконавець.
//
// Відправляємо до виконання п'ять завдань.
// Але оскільки застосовується метод newSingleThreadExecutor(),
// буде створено лише один новий потік і одночасно буде
// виконуватися лише одне завдання. Інші чотири завдання
// перебувають у черзі очікування. Як тільки завдання виконається
// потоком, цей потік відразу вибере і виконає наступне.
// Метод shutdown() очікує завершення виконання завдань,
// зараз переданих виконавцю, щоб завершити його роботу.
// Однак якщо вам хочеться завершити роботу виконавця
// без очікування, використовуйте натомість метод shutdownNow().
public class Main {

    public static void main(String[] args) {
        try (ExecutorService executor =
                     Executors.newSingleThreadExecutor()) {
            for (int i = 1; i <= 5; i++) {
                Runnable worker = new MyWorker("Task" + i);
                executor.execute(worker);
            }
            executor.shutdown();
        }
    }
}
