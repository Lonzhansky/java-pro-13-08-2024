package ua.hillel.lessons.lesson25.main._02_abstract_factory;

public class WindowsSmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Windows sms: " + message);
    }
}
