package ua.hillel.lessons.lesson25.main._01_factory_method;

public class TelegramNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending telegram " + message);
    }
}
