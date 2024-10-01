package ua.hillel.lessons.lesson12.demos._06_Problems._01_Race_Condition._03._04;

class MyThread extends Thread {

    int num;
    String name;

    MyThread(String name, int num) {
        this.num = num;
        this.name = name;
    }

    // Запуск потоків
    public void run() {
        // Виклик методу bookTicket() з Book
        Book.bookTicket(num, name);
    }
}
