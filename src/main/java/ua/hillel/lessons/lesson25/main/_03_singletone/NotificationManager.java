package ua.hillel.lessons.lesson25.main._03_singletone;

public class NotificationManager {

    private static NotificationManager intance;

    private NotificationManager() {
    }

    public static NotificationManager getInstance() {
        if (intance == null) {
            intance = new NotificationManager();
        }
        return intance;
    }

    public void send(String message) {
        System.out.println(message);
    }
}
