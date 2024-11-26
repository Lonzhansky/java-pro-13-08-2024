package ua.hillel.lessons.lesson24.app.observer;

import ua.hillel.lessons.lesson24.app.model.User;

public interface UserObserver {
    void update(User user);
}
