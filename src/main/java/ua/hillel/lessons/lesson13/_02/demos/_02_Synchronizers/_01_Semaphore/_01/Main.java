package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._01_Semaphore._01;

import java.util.concurrent.Semaphore;

// Вихідні дані можуть бути різними у різних виконаннях
// програми, але кінцеве значення змінної count завжди
// залишатиметься рівним 0.
public class Main {

    public static void main(String[] args)
            throws InterruptedException {
        Semaphore sem = new Semaphore(1);
        // Потік Alfa count++
        MyThread mt1 = new MyThread(sem, "Alfa");
        // Потік Beta count--
        MyThread mt2 = new MyThread(sem, "Beta");
        mt1.start();
        mt2.start();
        // Очікування потоків Alfa та Beta
        mt1.join();
        mt2.join();
        System.out.println("count: " + Shared.count);
    }
}
