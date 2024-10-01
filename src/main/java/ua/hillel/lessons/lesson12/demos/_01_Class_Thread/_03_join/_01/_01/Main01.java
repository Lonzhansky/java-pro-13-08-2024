package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._01._01;

// Приклад потоку без методу join().
// Якщо запускаємо потік без використання методу join(),
// виконання потоку неможливо передбачити.
// Планувальник потоків планує виконання потоку.
public class Main01 extends Thread {

    public static void main(String[] args) {
        Main01 thread1 = new Main01();
        Main01 thread2 = new Main01();
        thread1.start();
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
