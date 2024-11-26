package ua.hillel.lessons.lesson24.app.service;

import ua.hillel.lessons.lesson24.app.model.User;
import ua.hillel.lessons.lesson24.app.observer.UserObserver;
import ua.hillel.lessons.lesson24.app.observer.UserSubject;
import ua.hillel.lessons.lesson24.app.repository.LocalRepository;
import ua.hillel.lessons.lesson24.app.repository.Repository;
import ua.hillel.lessons.lesson24.app.validator.contex.UserValidatorContext;
import ua.hillel.lessons.lesson24.app.validator.strategy.RegistrationValidatorStrategy;
import ua.hillel.lessons.lesson24.app.validator.strategy.UpdateValidatorStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegistrationService implements UserSubject {

    private final Repository<User> userRepository;
    private final UserValidatorContext validatorContext;
    private final List<UserObserver> observers = new ArrayList<>();

    public RegistrationService(Repository<User> userRepository) {
        this.userRepository = userRepository;
        this.validatorContext = new UserValidatorContext();
    }

    public boolean registerUser(User user) {
        validatorContext.setStrategy(new RegistrationValidatorStrategy());
        if (validatorContext.validate(user)) {
            userRepository.save(user);
            notifyObservers(user);
            return true;
        }
        return false;
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public boolean updateUser(User user) {
        validatorContext.setStrategy(new UpdateValidatorStrategy());
        if (validatorContext.validate(user)) {
            ((LocalRepository) userRepository).update(user);
            notifyObservers(user);
            return true;
        }
        return false;
    }

    public boolean deleteUser(String id) {
        if (userRepository.findById(id).isPresent()) {
            ((LocalRepository) userRepository).delete(id);
            notifyObservers(new User(id, null, null, null));
            return true;
        }
        return false;
    }

    @Override
    public void addObserver(UserObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(UserObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(User user) {
        for (UserObserver observer : observers) {
            observer.update(user);
        }
    }
}
