package ua.hillel.lessons.lesson25.main._05_decorator;

public class SimpleNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending notification: " + message);
    }
}
