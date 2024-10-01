package ua.hillel.lessons.lesson12.demos._05_Thread_stop;

// Приклад класу, що реалізує Runnable,
// який містить додатковий метод doStop(),
// що сигналізує Runnable про зупинку.
// Runnable перевірить цей сигнал і зупиниться,
// коли буде готовий до цього.
//
// Зверніть увагу на методи doStop() та keepRunning().
// doStop() призначений для виклику з іншого потоку,
// чим потік, що виконує метод run() MyRunnable.
// Метод keepRunning() викликається внутрішнім потоком,
// виконує метод run() класу MyRunnable.
// Поки doStop() не буде викликаний, метод keepRunning() буде
// повертати значення true, що означає, що потік,
// виконує метод run(), продовжуватиме працювати.
public class MyRunnable implements Runnable {

    private boolean doStop = false;

    public synchronized void doStop() {
        doStop = true;
    }

    private synchronized boolean keepRunning() {
        return !doStop;
    }

    @Override
    public void run() {
        while(keepRunning()) {
            // Продовжує свою роботу
            System.out.println("Running");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
