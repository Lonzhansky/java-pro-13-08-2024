package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._01.notifyall;

public class MyThread01 extends Thread {

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()
                    + "...starts");
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName()
                    + "...notified");
        }
    }
}
