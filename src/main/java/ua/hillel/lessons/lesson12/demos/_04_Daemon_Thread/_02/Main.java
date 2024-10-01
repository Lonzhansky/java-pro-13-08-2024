package ua.hillel.lessons.lesson12.demos._04_Daemon_Thread._02;

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

        // Намагаємося встановити потік у потік-демон.
        thread2.setDaemon(true);
        thread2.start();

        // Стартуємо поток
        thread1.start();
        // Намагаємося встановити потік у потік-демон.
        // Маємо обробити виняток.
        try {
            thread1.setDaemon(true);
        } catch (IllegalThreadStateException e) {
            System.out.println("Exception");
        }

        // Не намагаємося встановити потік у потік-демон
        thread3.start();
    }
}
