package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._01.notifyall;

// При запуску, програма неповинна зависнути,
// оскільки всі потоки нотіфіковані
public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread01 thread01 = new MyThread01();
        MyThread02 thread02 = new MyThread02(thread01);
        MyThread03 thread03 = new MyThread03(thread01);

        Thread t1 = new Thread(thread01, "Thread-1");
        Thread t2 = new Thread(thread02, "Thread-2");
        Thread t3 = new Thread(thread03, "Thread-3");

        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}
