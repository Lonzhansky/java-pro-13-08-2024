package ua.hillel.lessons.lesson12.demos._02_Thread_Priorities._02;

public class MyThread02 extends Thread {

    public void run() {
        // Встановлюємо пріоритет потоку через константу,
        // яка зазначена в Class Thread
        this.setPriority(Thread.MAX_PRIORITY);
        int threadPriority = this.getPriority();
        System.out.println("Thread 2 priority is " +
                threadPriority);
    }
}
