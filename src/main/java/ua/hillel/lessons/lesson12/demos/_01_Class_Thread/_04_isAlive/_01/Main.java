package ua.hillel.lessons.lesson12.demos._01_Class_Thread._04_isAlive._01;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        // Перевіряємо живий потік чи ні.
        // Повертає логічне значення true, якщо потік живий,
        // інакше false
        System.out.println("Thread 1 " + thread1.isAlive());
        System.out.println("Thread 2 " + thread2.isAlive());
    }
}
