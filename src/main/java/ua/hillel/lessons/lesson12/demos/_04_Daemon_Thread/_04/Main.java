package ua.hillel.lessons.lesson12.demos._04_Daemon_Thread._04;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread daemonThread = new MyThread("Daemon Thread");

        // Помічаємо потік як демон
        daemonThread.setDaemon(true);

        // Запускаємо потік
        daemonThread.start();

        // Основний потік завершується через 3 секунди
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Основний потік завершений");
    }
}