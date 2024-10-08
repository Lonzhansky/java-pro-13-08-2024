package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._01.notifyall;

public class MyThread03 extends Thread {

    final MyThread01 thread01;

    MyThread03(MyThread01 thread01) {
        this.thread01 = thread01;
    }

    public void run() {
        synchronized (this.thread01) {
            System.out.println(Thread.currentThread().getName()
                    + "...starts");
            this.thread01.notifyAll();
            System.out.println(Thread.currentThread().getName()
                    + "...notified");
        }
    }
}
