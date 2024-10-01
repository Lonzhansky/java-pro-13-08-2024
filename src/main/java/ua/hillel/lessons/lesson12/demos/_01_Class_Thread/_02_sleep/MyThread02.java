package ua.hillel.lessons.lesson12.demos._01_Class_Thread._02_sleep;

// Thread.sleep() взаємодіє з планувальником потоків,
// щоб перевести поточний потік у стан очікування на вказаний
// період часу.
// Після закінчення часу очікування стан потоку змінюється
// на стан готовності до виконання та очікування ЦП для
// подальшого виконання.
// Таким чином, фактичний час очікування поточного потоку
// залежить від планувальника потоків, який є частиною
// операційної системи.
public class MyThread02 extends Thread {

    MyThread02(String str) {
        super(str);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " started.");
        try {
            System.out.println(Thread.currentThread().getName() +
                    " is sleeping...");
            MyThread02.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println(Thread.currentThread().getName() +
                " finished.");
    }
}
