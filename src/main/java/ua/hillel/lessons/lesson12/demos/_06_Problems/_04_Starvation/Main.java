package ua.hillel.lessons.lesson12.demos._06_Problems._04_Starvation;

//  Потоку t1 присвоєно максимальний пріоритет потоку,
//  і він кілька разів викликає синхронізований метод.
//  Потоку t2 був призначений мінімальний пріоритет потоку,
//  і він викликає синхронізований метод лише один раз,
//  але він повинен чекати, поки виконуються всі три виклику потоку t1
//  синхронизированный метод.
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        Thread t1 = new Thread(new MyThread01(main), "t1");
        Thread t2 = new Thread(new MyThread02(main), "t2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }

    public synchronized void handleData() {
        try {
            System.out.println("Doing some heavy processing for thread " +
                    Thread.currentThread().getName());
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
