package ua.hillel.lessons.lesson25.main._02_abstract_factory;

public class Main {
    public static void main(String[] args) {

        WindowsNotificationFactory windowsNotificationFactory = new WindowsNotificationFactory();
        MacNotificationFactory macNotificationFactory = new MacNotificationFactory();

        Notification emailNotification = windowsNotificationFactory.createEmailNotification();
        Notification smsNotification = windowsNotificationFactory.createSmsNotification();

        emailNotification.send("HELLO EMAIL");
        smsNotification.send("HELLO SMS");


        Notification macEmailNotification = macNotificationFactory.createEmailNotification();
        macEmailNotification.send("HELLO MAC");

    }
}
