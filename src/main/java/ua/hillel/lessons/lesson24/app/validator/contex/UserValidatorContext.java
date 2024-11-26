package ua.hillel.lessons.lesson24.app.validator.contex;

import ua.hillel.lessons.lesson24.app.model.User;
import ua.hillel.lessons.lesson24.app.validator.strategy.UserValidatorStrategy;

public class UserValidatorContext {

    private UserValidatorStrategy strategy;

    public void setStrategy(UserValidatorStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(User user) {
        if (strategy == null) {
            throw new IllegalStateException("validation state not set!!!");
        }
        return strategy.isValid(user);
    }
}
