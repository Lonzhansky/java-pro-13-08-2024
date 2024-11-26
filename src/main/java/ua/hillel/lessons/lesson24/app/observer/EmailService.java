package ua.hillel.lessons.lesson24.app.observer;

import ua.hillel.lessons.lesson24.app.model.User;

public class EmailService implements UserObserver {
    @Override
    public void update(User user) {
        System.out.println("EmailService: sending email to " + user.getName());
    }
}
