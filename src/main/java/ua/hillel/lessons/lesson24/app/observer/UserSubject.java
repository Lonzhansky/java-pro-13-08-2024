package ua.hillel.lessons.lesson24.app.observer;

import ua.hillel.lessons.lesson24.app.model.User;

public interface UserSubject {

    void addObserver(UserObserver observer);

    void removeObserver(UserObserver observer);

    void notifyObservers(User user);

}