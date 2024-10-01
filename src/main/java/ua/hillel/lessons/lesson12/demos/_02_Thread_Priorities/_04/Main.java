package ua.hillel.lessons.lesson12.demos._02_Thread_Priorities._04;

public class Main {

    public static void main(String[] args) {
        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02();
        MyThread03 thread03 = new MyThread03();

        thread01.start();
        thread02.start();
        thread03.start();

        System.out.println(thread01.getPriority());
        // Встановлюємо пріоритети потоків через значення
        thread01.setPriority(2);
        int threadPriority1 = thread01.getPriority();
        thread02.setPriority(9);
        int threadPriority2 = thread02.getPriority();
        thread03.setPriority(6);
        int threadPriority3 = thread03.getPriority();

        System.out.println("Thread 1 priority is " + threadPriority1 +
                "\nThread 2 priority is " + threadPriority2 +
                "\nThread 3 priority is " + threadPriority3);
    }
}
