package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._01;

// Клас, що реалізує Interface Runnable.
// Після реалізації Interface  Runnable у класі
// необхідно реалізувати метод run().
public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }
}
