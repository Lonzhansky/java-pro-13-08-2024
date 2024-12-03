package ua.hillel.lessons.lesson25.main._05_decorator;

public class SmsDecorator extends NotificationDecorator {
    public SmsDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("... and sending as SMS: " + message);
    }
}
