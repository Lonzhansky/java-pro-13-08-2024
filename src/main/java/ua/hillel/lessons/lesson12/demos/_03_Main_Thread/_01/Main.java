package ua.hillel.lessons.lesson12.demos._03_Main_Thread._01;

public class Main extends Thread {

    public static void main(String[] args) {

        // Отримання посилання на основний потік
        Thread mainThread = Thread.currentThread();

        // Отримання імені основного потоку
        System.out.println("Current thread name is "
                + mainThread.getName());

        // Зміна імені основного потоку
        mainThread.setName("MySuperMain");
        System.out.println("After change, name is "
                + mainThread.getName());

        // Отримання пріоритету основного потоку
        System.out.println("Main Thread priority is "
                + mainThread.getPriority());

        // Встановлення пріоритету основного потоку на MAX(10)
        mainThread.setPriority(MAX_PRIORITY);

        // Відображаємо пріоритет основного потоку
        System.out.println("Main Thread new priority is "
                + mainThread.getPriority());

        for (int i = 1; i < 4; i++) {
            System.out.println("Main Thread - " + i);
        }

        // Основний потік створює дочірній потік
        // метод run() потоку
        MyThread01 thread01 = new MyThread01();

        // Отримання пріоритету дочірнього потоку
        // який буде успадкований від основного потоку,
        // оскільки він створюється основним потоком
        System.out.println("Thread 1 priority is "
                + thread01.getPriority());

        // Встановлення пріоритету дочірнього потоку на MIN(1)
        thread01.setPriority(MIN_PRIORITY);

        System.out.println("Thread 1 new priority is "
                + thread01.getPriority());

        // Запускаємо дочірній потік
        thread01.start();
    }
}
