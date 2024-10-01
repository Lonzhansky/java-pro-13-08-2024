package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._02;

// Без використання join().
// Тут три потоки th1, th2 та th3.
// Незважаючи на те, що ми запустили потоки послідовно,
// планувальник потоків не запускає і не закінчує їх у
// вказаному порядку.
// Щоразу, коли запускаємо цей код, можете щоразу
// отримувати різні результати.
public class MyThreadJoin01 {

    public static void main(String[] args) {
        Thread th1 = new Thread(new MyThread01(), "th1");
        Thread th2 = new Thread(new MyThread01(), "th2");
        Thread th3 = new Thread(new MyThread01(), "th3");

        th1.start();
        th2.start();
        th3.start();
    }
}
