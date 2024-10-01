package ua.hillel.lessons.lesson12.demos._01_Class_Thread._08_isInterrupted;

// 1) Метод isInterrupted() повертає true.
// 2) Викликається interrupted() та повертає true,
// а потім змінює на false.
// 3) isInterrupted() повертає значення false,
// оскільки interrupted() змінив його.
//
// Оскільки виклик методу interrupted() змінив статус
// на false перед викликом sleep(), тому помилки немає.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
    }
}
