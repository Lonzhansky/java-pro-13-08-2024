package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._02;

public class Main03 {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        // Виклик Thread.start для запуску нового потоку
        mt.start();
        // Чи можемо ми запустити потік двічі?
        // Ні, потік не може бути запущений двічі.
        // Якщо спробуєте це зробити, буде викинуто
        // виняток IlegallegalThreadStateException.
        mt.start();
    }
}
