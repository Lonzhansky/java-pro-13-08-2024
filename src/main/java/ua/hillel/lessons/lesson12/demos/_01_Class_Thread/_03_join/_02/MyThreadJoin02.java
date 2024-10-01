package ua.hillel.lessons.lesson12.demos._01_Class_Thread._03_join._02;

// Приклад з join()
public class MyThreadJoin02 {

    public static void main(String[] args) {
        Thread th1 = new Thread(new MyThread02(), "th1");
        Thread th2 = new Thread(new MyThread02(), "th2");
        Thread th3 = new Thread(new MyThread02(), "th3");

        // Негайно запускається перший потік (th1)
        th1.start();

        // Запускається другий потік (th2),
        // як тільки перший потік (th1) буде мертвий
        try {
            th1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        th2.start();

        // Починаємо третій потік (th3) після того,
        // як другий потік (th2) мертвий
        try {
            th2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        th3.start();

        // Відображення повідомлення після того,
        // як третій потік (th3) мертвий
        try {
            th3.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("All threads have finished execution");
    }
}
