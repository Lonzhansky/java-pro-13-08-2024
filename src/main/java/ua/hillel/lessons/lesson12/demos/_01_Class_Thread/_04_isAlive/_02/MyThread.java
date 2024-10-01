package ua.hillel.lessons.lesson12.demos._01_Class_Thread._04_isAlive._02;

public class MyThread extends Thread {

    public void run() {

        System.out.println("Result 1");

        try {
            // Переводимо потік у сплячий режим на 300 мілісекунд
            // використовуємо метод sleep()
            Thread.sleep(300);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }

        System.out.println("Result 2");
    }
}
