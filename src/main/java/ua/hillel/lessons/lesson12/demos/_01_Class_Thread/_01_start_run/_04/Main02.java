package ua.hillel.lessons.lesson12.demos._01_Class_Thread._01_start_run._04;

public class Main02 {

    public static void main(String[] args) {
        // Використовуємо лямбду
        Runnable myRunnable = () -> {
            String myName = Thread.currentThread().getName();
            System.out.println("Name is " + myName);
        };
        // Створюємо об'єкт Thread
        Thread thread = new Thread(myRunnable);
        // Встановлюємо ім'я потоку
        thread.setName("Tom");
        // Викликаємо метод start(), щоб
        // перевести цей потік у стадію Runnable
        thread.start();
    }
}
