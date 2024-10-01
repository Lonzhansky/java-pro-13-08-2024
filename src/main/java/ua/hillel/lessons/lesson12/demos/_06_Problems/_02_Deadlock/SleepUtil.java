package ua.hillel.lessons.lesson12.demos._06_Problems._02_Deadlock;

// Клас для призупинення потоку
public class SleepUtil {

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
