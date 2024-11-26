package ua.hillel.lessons.lesson24.app.validator.strategy;

import ua.hillel.lessons.lesson24.app.model.User;

public class UpdateValidatorStrategy implements UserValidatorStrategy {
    @Override
    public boolean isValid(User user) {
        return user.getEmail().contains("@");
    }
}
