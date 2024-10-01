package ua.hillel.lessons.lesson12.demos._04_Daemon_Thread._03;

// Демон-потоки є потоками низького рівня.
// Пріоритет потоків, який одержуємо, встановлюється JVM.
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
        System.out.println(getName() + " priority "
                + Thread.currentThread().getPriority());
    }
}
