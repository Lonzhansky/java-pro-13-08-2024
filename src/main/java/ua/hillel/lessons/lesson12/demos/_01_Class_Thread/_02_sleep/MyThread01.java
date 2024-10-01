package ua.hillel.lessons.lesson12.demos._01_Class_Thread._02_sleep;

// Присипляємо потоки, використовуючи метод Thread.sleep.
// Кожен потік спатиме протягом певної кількості мілісекунд,
// а потім відновить своє виконання.
// Метод currentThread() повертає об’єкт Thread для поточного потоку.
// Метод getName() повертає ім'я поточного потоку.
public class MyThread01 extends Thread {

    MyThread01(String str) {
        super(str);
    }

    public void run() {

        // Виведення одразу після старту програми
        System.out.println(Thread.currentThread().getName() +
                " started.");

        try {
            // Присипляємо на 2000 мілісекунд
            MyThread01.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }

        // Виведення після певної кількості часу на засинання потоку
        System.out.println(Thread.currentThread().getName() +
                " finished.");
    }
}
