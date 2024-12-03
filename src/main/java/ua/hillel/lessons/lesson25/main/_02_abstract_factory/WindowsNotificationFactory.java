package ua.hillel.lessons.lesson25.main._02_abstract_factory;

public class WindowsNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new WindowsEmailNotification();
    }

    @Override
    public Notification createSmsNotification() {
        return  new WindowsSmsNotification();
    }
}
