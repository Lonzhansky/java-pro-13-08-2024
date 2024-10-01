package ua.hillel.lessons.lesson12.demos._04_Daemon_Thread._01;

// Метод setDaemon(boolean on) позначає потік як потік-демон
// або потік користувача. JVM завершує роботу, коли єдиними
// запущеними потоками є потоки-демони.
// Якщо параметр on є true, то потік є потік-демон.
// Цей метод необхідно викликати перед запуском потоку,
// інакше буде викинуто виняток IllegalThreadStateException,
// якщо потік активний.
public class Main {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Встановлення потоку як потік-демон
        thread1.setDaemon(true);
        thread1.start();

        // Встановлення потоку як НЕ потік-демон
        thread2.setDaemon(false);
        thread2.start();

        // Встановлення потоку як потік-демон
        thread3.setDaemon(true);
        thread3.start();
    }
}
