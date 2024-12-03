package ua.hillel.lessons.lesson25.main._02_abstract_factory;

public interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSmsNotification();
}
