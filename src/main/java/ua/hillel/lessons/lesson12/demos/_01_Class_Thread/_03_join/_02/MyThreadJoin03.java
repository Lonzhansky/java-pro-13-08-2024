package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._02;

// Якщо потік має дочекатися завершення
// будь-якого іншого потоку, ми маємо
// використовувати метод join().
public class MyThreadJoin03 {

    public static void main(String[] arg) throws InterruptedException {

        MyThread03 t = new MyThread03();
        t.start();
        // Якщо закоментувати join(),
        // виконання буде іншим.
        t.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
