package ua.hillel.lessons.lesson12.demos._01_Class_Thread._06_interrupt._01;

// Запускаємо потоки. Один з них перериваємо.
// Як тільки певний потік перейде в сплячий стан,
// він буде негайно перерваний.
public class Main {

    public static void main(String[] args) {
        MyThread01 thread1 = new MyThread01();
        MyThread02 thread2 = new MyThread02();
        thread1.start();
        thread2.start();
        thread1.interrupt(); // <- перериваємо потік
    }
}