package ua.hillel.lessons.lesson25.main._06_observer;

public class Main {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();

        EmailObserver emailObserver = new EmailObserver();
        SmsObserver smsObserver = new SmsObserver();
        TelegramObserver telegramObserver = new TelegramObserver();

        notificationService.subscribe(emailObserver);
        notificationService.subscribe(smsObserver);
        notificationService.subscribe(telegramObserver);

        notificationService.notifyObservers("System update available!!!");

    }

}
