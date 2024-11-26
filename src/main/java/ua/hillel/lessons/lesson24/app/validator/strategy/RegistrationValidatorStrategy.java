package ua.hillel.lessons.lesson24.app.validator.strategy;

import ua.hillel.lessons.lesson24.app.model.User;

public class RegistrationValidatorStrategy implements UserValidatorStrategy{
    @Override
    public boolean isValid(User user) {
        return user.getEmail().contains("@")
                && !user.getName().isBlank()
                && user.getRole() != null;
    }
}
