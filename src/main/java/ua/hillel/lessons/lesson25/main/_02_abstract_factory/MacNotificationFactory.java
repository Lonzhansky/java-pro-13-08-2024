package ua.hillel.lessons.lesson25.main._02_abstract_factory;

public class MacNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new MacEmailNotification();
    }

    @Override
    public Notification createSmsNotification() {
        return new MacSmsNotification();
    }
}
