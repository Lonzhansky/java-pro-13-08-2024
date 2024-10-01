package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._02;

class MyThread01 implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread started: " + t.getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: " + t.getName());
    }
}
