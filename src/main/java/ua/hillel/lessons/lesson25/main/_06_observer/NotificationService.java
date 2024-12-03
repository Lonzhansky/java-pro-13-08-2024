package ua.hillel.lessons.lesson25.main._06_observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {     // or ADD
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {     // or REMOVE
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
