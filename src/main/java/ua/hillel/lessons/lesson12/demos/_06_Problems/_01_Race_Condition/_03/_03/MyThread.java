package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._03._03;

class MyThread extends Thread {

    Book book;
    int num;
    String name;

    MyThread(Book book, String name, int num) {
        this.book = book;
        this.num = num;
        this.name = name;
    }

    // Запуск потоків
    public void run() {
        // Виклик bookTicket(), використовуючі об'єкт,
        // який передається з класу Main
        book.bookTicket(num, name);
    }
}
