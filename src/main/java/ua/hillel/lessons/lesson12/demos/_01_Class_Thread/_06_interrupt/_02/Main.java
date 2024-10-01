package ua.hillel.lessons.lesson12.demos._01_Class_Thread._06_interrupt._02;

// Тут виклик методу interrupt(), здійснено основним потоком,
// очікуватиме, поки MyThread01 потік не перейде в сплячий стан.
// Як тільки MyThread01 потік перейде в сплячий стан,
// він буде негайно перерваний.
public class Main {

    public static void main(String[] args) {
        MyThread01 thread1 = new MyThread01();
        thread1.start();
        thread1.interrupt(); // <- перериваємо потік
        System.out.println("Main Thread.");
    }
}
