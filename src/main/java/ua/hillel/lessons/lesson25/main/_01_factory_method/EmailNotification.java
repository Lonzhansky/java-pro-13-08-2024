package ua.hillel.lessons.lesson25.main._01_factory_method;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
