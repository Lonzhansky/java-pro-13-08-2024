package ua.hillel.lessons.lesson12.demos._02_Thread_Priorities._03;

public class MyThread01 extends Thread {

    public void run() {
        // Встановлюємо пріоритет потоку через значення
        this.setPriority(2);
        int threadPriority = this.getPriority();
        System.out.println("Thread 1 priority is " +
                threadPriority);
    }
}
