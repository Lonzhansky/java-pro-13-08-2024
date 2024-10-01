package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._03._01;

public class Main {

    public static void main(String[] args) {

        // Створення об'єкту Book та передача
        // в класс MyThread
        Book book = new Book();
        MyThread t1 = new MyThread(book, "Tom", 1);
        MyThread t2 = new MyThread(book, "Alice", 1);

        // Коли програма викликає метод start(),
        // створюється новий потік,
        // а потім метод run() виконується.

        // Старт потоків
        t1.start();
        t2.start();
    }
}
