package ua.hillel.lessons.lesson13._02.demos._03_Executors._03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// CachedThreadPool виконавець.
//
// Метод newCachedThreadPool().
// Коли ми створюємо пул потоків за допомогою цього методу,
// максимальний розмір пулу потоків встановлюється на
// максимальне ціле значення в Java.
// Цей метод створює нові потоки на запит і руйнує потоки,
// які простоюють більше хвилини, якщо запит відсутній.
//
// Тут метод newCachedThreadPool() спочатку створить
// п'ять нових потоків та опрацює п'ять завдань.
// Жодної черги очікування тут не буде.
// Якщо потік залишається у бездіяльності більше хвилини,
// метод усуває його.
// Таким чином, цей метод - хороший вибір, якщо вам хочеться досягти
// більшої продуктивності черги, ніж можливо з методом
// newFixedThreadPool().
// Але якщо ви хочете обмежити кількість паралельно виконуваних завдань
// заради управління ресурсами, краще використовувати newFixedThreadPool().
public class Main {

    public static void main(String[] args) {
        try (ExecutorService executor =
                     Executors.newCachedThreadPool()) {
            for (int i = 1; i <= 5; i++) {
                Runnable worker = new MyWorker("Task" + i);
                executor.execute(worker);
            }
            executor.shutdown();
        }
    }
}
