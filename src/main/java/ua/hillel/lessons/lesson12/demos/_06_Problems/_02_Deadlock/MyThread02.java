package ua.hillel.lessons.lesson12.demos._06_Problems._02_Deadlock;

public class MyThread02 extends Thread {

    private final Shared s1;
    private final Shared s2;

    public MyThread02(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    // Запуск потоку
    @Override
    public void run() {
        // Блокування об'єкту s2 в методі test2
        s2.test1(s1);
    }
}
