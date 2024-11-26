package ua.hillel.lessons.lesson24.app.observer;

import ua.hillel.lessons.lesson24.app.model.User;

public class TelegramService implements UserObserver {
    @Override
    public void update(User user) {
        System.out.println("TelegramService: sending message " + user.getName());
    }
}
