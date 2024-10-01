package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._01;

public class Main {

    public static void main(String[] args) {
        // Якщо реалізуєте Interface Runnable у своєму класі,
        // необхідно явно створити об'єкт Class Thread та передати
        // об'єкт класу, реалізований через Interface Runnable,
        // як параметр у його конструкторі.
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        // Для виклику методу run() використовується метод start().
        // При виклику start() потоку надається новий стек,
        // і викликається метод run() для введення нового потоку
        // у програму.
        thread.start();
    }
}
