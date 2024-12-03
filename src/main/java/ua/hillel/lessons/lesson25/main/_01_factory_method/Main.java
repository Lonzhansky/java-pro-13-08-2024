package ua.hillel.lessons.lesson25.main._01_factory_method;

public class Main {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification email = notificationFactory.createNotification("telegram");

        email.send("HELLO!");

    }
}
