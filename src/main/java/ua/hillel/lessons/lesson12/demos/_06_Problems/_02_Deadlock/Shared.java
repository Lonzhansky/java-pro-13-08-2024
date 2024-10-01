package ua.hillel.lessons.lesson12.demos._06_Problems._02_Deadlock;

// Клас, який використовується обома потоками
public class Shared {

    // Перший синхронізований метод
    synchronized void test1(Shared shared) {
        System.out.println(Thread.currentThread().getName() + " test1-begin");
        SleepUtil.sleep(1000);
        // Блокування об'єкту s2 в методі test2
        shared.test2();
        System.out.println("test1-end");
    }

    // Другий синхронізований метод
    synchronized void test2() {
        System.out.println("test2-begin");
        SleepUtil.sleep(1000);
        // Блокування об'єкту s1 в методі test1
        System.out.println("test2-end");
    }
}
