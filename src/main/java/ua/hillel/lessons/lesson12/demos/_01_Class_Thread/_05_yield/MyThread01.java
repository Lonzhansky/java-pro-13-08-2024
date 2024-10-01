package ua.hillel.lessons.lesson12.demos._01_Class_Thread._05_yield;

class MyThread01 extends Thread {

    public void run() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println("Thread 1, count is " + count);
            Thread.yield();
        }
    }
}
