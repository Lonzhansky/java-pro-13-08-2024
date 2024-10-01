package ua.hillel.lessons.lesson12.demos._04_Daemon_Thread._02;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        // Перевірка того, чи є потік потоком-демоном чи ні,
        // через метод isDaemon(), який повертає true,
        // якщо потік є потоком-демоном, інакше false.
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }
}
