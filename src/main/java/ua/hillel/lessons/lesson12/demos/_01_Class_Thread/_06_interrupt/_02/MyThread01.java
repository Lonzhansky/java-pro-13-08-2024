package ua.hillel.lessons.lesson12.demos._01_Class_Thread._06_interrupt._02;

class MyThread01 extends Thread {

    public void run() {
        try {
            for (int i = 1; i < 14; i++) {
                System.out.println("Thread 1 - " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 interrupted.");
        }
    }
}
