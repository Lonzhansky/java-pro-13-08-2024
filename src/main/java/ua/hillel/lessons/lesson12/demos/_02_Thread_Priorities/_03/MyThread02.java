package ua.hillel.lessons.lesson12.demos._02_Thread_Priorities._03;

public class MyThread02 extends Thread {

    public void run() {
        // Встановлюємо пріоритет потоку через значення
        this.setPriority(9);
        int threadPriority = this.getPriority();
        System.out.println("Thread 2 priority is " +
                threadPriority);
    }
}
