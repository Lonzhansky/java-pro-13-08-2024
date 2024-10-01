package ua.hillel.lessons.lesson12.demos._01_Class_Thread._07_interrupted;

public class MyThread01 extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            // Метод interrupted() перевіряє, чи був
            // поточний потік перерваний
            if (Thread.interrupted()) {
                System.out.println("Thread 1 interrupted.");
            } else {
                System.out.println("Thread 1 is running...");
            }
        }
    }
}
