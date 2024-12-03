package ua.hillel.lessons.lesson25.main._05_decorator;

public class EmailDecorator extends NotificationDecorator {
    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("... and sending as Email: " + message);
    }
}
