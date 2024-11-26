package ua.hillel.lessons.lesson24.app.validator.strategy;

import ua.hillel.lessons.lesson24.app.model.User;

public interface UserValidatorStrategy {

    boolean isValid(User user);
}
