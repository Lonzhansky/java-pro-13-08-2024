package ua.hillel.lessons.lesson25.main._05_decorator;

public class Main {
    public static void main(String[] args) {

        SimpleNotification simpleNotification = new SimpleNotification();

        EmailDecorator emailDecorator = new EmailDecorator(simpleNotification);
        SmsDecorator smsDecorator = new SmsDecorator(emailDecorator);
        TelegramDecorator telegramDecorator = new TelegramDecorator(smsDecorator);

        telegramDecorator.send("MESSAGE!!!");

    }
}
