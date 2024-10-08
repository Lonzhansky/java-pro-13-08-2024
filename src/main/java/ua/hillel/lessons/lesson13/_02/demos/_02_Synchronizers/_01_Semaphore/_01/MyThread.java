package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._01_Semaphore._01;

import java.util.concurrent.Semaphore;

// Виклик sleep() у методі run() усередині класу для того,
// щоб переконатися, що доступ до Shared.count
// синхронізується семафором.
// У run() виклик sleep() викликає паузу викликаючого потоку
// між кожним доступом до Shared.count.
// Зазвичай це дозволяє запустити другий потік.
// Однак через семафор другий потік повинен чекати,
// поки перший не звільнить дозвіл, що відбувається
// тільки після завершення всіх звернень першого потоку.
// Таким чином, Shared.count спочатку збільшується кілька разів
// потоком Alfa, а згодом кілька разів зменшується потоком Beta.
// Збільшення та зменшення не змішуються.
//
// Без використання семафору доступ до Shared.count обома потоками
// відбувався б одночасно, а збільшення та зменшення були б
// перемішані.
// Щоб переконатися в цьому, спробуємо закоментувати виклики
// acquire() та release().
// Коли запустимо програму, побачимо, що доступ до Shared.count більше
// не синхронізується, тому не завжди отримуватимемо значення count
// рівним 0.
public class MyThread extends Thread {

    Semaphore sem;
    String threadName;

    public MyThread(Semaphore sem, String threadName) {
        super(threadName);
        this.sem = sem;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Запуск потоку Alfa
        if (this.getName().equals("Alfa")) {
            System.out.println("Starting " + threadName);
            try {
                System.out.println(threadName + " is waiting for a permit.");
                // Перед отриманням дозволу, отримується блокування
                sem.acquire();
                System.out.println(threadName + " gets a permit.");
                // Тепер доступ до загального ресурсу.
                // Інші чекаючі потоки чекатимуть, поки цей
                // потік звільняє блокування
                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(threadName + ": " + Shared.count);
                    // Тепер дозволяємо перемикання контексту
                    // виконання потоку Beta.
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
            // Визволяємося від дозволу
            System.out.println(threadName + " releases the permit.");
            sem.release();
        }
        // Запуск потоку Beta
        else {
            System.out.println("Starting " + threadName);
            try {
                System.out.println(threadName + " is waiting for a permit.");
                // Перед отриманням дозволу, отримується блокування
                sem.acquire();
                System.out.println(threadName + " gets a permit.");
                // Тепер доступ до загального ресурсу.
                // Інші чекаючі потоки чекатимуть, поки цей
                // потік звільняє блокування
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(threadName + ": " + Shared.count);
                    // Тепер дозволяємо перемикання контексту
                    // для виконання потоку Alfa
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
            // Визволяємося від дозволу
            System.out.println(threadName + " releases the permit.");
            sem.release();
        }
    }
}
