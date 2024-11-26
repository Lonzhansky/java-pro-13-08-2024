package ua.hillel.lessons.lesson24.app.observer;

import ua.hillel.lessons.lesson24.app.model.User;

public class AuditService implements UserObserver {
    @Override
    public void update(User user) {
        System.out.println("AuditService: logging user update: " + user.getId() + " - " + user.getName());
    }
}
