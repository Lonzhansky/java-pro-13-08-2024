package ua.hillel.lessons.lesson25.main._06_observer;

public class TelegramObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("TelegramObserver received: " + message);
    }
}
