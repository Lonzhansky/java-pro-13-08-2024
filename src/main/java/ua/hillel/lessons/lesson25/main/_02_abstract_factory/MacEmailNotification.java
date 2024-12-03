package ua.hillel.lessons.lesson25.main._02_abstract_factory;

public class MacEmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Mac email: " + message);
    }
}
