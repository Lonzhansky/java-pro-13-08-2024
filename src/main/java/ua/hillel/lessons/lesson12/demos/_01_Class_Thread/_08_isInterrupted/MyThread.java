package ua.hillel.lessons.lesson12.demos._01_Class_Thread._08_isInterrupted;

public class MyThread extends Thread {

    public void run() {
        try {
            System.out.println("1) isInterrupted() - " +
                    Thread.currentThread().isInterrupted());
            System.out.println("2) interrupted() - " +
                    Thread.interrupted());
            System.out.println("3) isInterrupted() - " +
                    Thread.currentThread().isInterrupted());
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println("Error has happened!");
        }
    }
}
