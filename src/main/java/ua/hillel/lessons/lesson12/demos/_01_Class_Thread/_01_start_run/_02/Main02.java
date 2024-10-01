package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._02;

public class Main02 {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        // Якщо викличемо метод run() прямо,
        // не використовуючи метод start(),
        // потоку не буде виділено новий стек викликів.
        // Поток почне працювати в поточному стеку викликів,
        // тобто стеку викликів основного потоку.
        // Отже, багатопоточності не буде.
        mt.run();
    }
}
