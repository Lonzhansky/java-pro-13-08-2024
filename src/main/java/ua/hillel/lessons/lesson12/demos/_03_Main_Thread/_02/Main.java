package ua.hillel.lessons.lesson12.demos._03_Main_Thread._02;

// Демонстрація взаємоблокування,
// використання основного потоку.
// Оператор Thread.currentThread().join()
// повідомляє основний поток, що йому потрібно
// дочекатися завершення цього потоку (тобто
// дочекатися самого себе).
// Таким чином, основний потік чекає, коли він
// помре, що є не чим іншим, як глухий кут.
public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Entering into Deadlock");

            // Приєднання до поточного потоку
            Thread.currentThread().join();

            // Цей оператор не буде виконаний
            System.out.println("This statement will never execute");
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
