package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._01.notify;

public class MyThread02 extends Thread {

    final MyThread01 thread01;

    MyThread02(MyThread01 thread01) {
        this.thread01 = thread01;
    }

    public void run() {
        synchronized (this.thread01) {
            System.out.println(Thread.currentThread().getName()
                    + "...starts");
            try {
                this.thread01.wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName()
                    + "...notified");
        }
    }
}
