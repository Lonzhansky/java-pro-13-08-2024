package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._03._03;

public class Main {

    public static void main(String[] args) {

        // Створення 2-х об'єктів Book
        // і передача їх в MyThread
        Book book1 = new Book();
        Book book2 = new Book();
        MyThread t1 = new MyThread(book1, "Tom", 1);
        MyThread t2 = new MyThread(book2, "Alice", 1);

        // Коли програма викликає метод start(),
        // створюється новий потік,
        // а потім метод run() виконується.

        // Старт потоків
        t1.start();
        t2.start();
    }
}
