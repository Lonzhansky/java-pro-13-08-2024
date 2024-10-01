package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._01._01;

// Приклад потоку з методом join().
// У цьому прикладі використовуємо метод join(),
// щоб переконатися, що потік завершив своє
// виконання перед запуском іншого потоку.
// Це корисно, коли хочемо виконати кілька
// потоків залежно від вимог розробки.
public class Main02 extends Thread {

    public static void main(String[] args) {
        Main02 thread1 = new Main02();
        Main02 thread2 = new Main02();
        thread1.start();

        try {
            // Очікування завершення thread1
            thread1.join();
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }

        thread2.start();
    }

    public void run() {
        System.out.println("Result 1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println("Result 2");
    }
}
