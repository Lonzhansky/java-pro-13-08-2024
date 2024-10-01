package ua.hillel.lessons.lesson12.demos._02_Thread_Priorities._02;

public class MyThread03 extends Thread {

    public void run() {
        // Встановлюємо пріоритет потоку через константу,
        // яка зазначена в Class Thread
        this.setPriority(Thread.NORM_PRIORITY);
        int threadPriority = this.getPriority();
        System.out.println("Thread 3 priority is " +
                threadPriority);
    }
}
