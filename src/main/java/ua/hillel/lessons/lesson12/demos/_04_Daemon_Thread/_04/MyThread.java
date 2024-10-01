package ua.hillel.lessons.lesson12.demos._04_Daemon_Thread._04;

// Демон-потоки є потоками низького рівня.
// Пріоритет потоків, який одержуємо, встановлюється JVM.
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("Демон працює у фоновому режимі...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
