package ua.hillel.lessons.lesson25.main._01_factory_method;

public class NotificationFactory {

    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("telegram")) {
            return new TelegramNotification();
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }

}
