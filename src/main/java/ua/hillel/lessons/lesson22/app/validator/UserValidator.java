package ua.hillel.lessons.lesson22.app.validator;

import ua.hillel.lessons.lesson22.app.model.User;

public class UserValidator implements Validator<User> {

    @Override
    public boolean isValid(User user) {
        return user.getEmail().contains("@") && !user.getName().isBlank();
    }

}
