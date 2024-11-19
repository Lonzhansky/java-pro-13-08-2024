package ua.hillel.lessons.lesson22.app.service;

import ua.hillel.lessons.lesson22.app.model.User;
import ua.hillel.lessons.lesson22.app.repository.LocalRepository;
import ua.hillel.lessons.lesson22.app.repository.Repository;
import ua.hillel.lessons.lesson22.app.validator.Validator;

import java.util.List;
import java.util.Optional;

public class RegistrationService {

    private final Repository<User> userRepository;
    private final Validator<User> validator;

    public RegistrationService(Repository<User> userRepository, Validator<User> validator) {
        this.userRepository = userRepository;
        this.validator = validator;
    }

    public boolean registerUser(User user) {
        if (validator.isValid(user)) {
            userRepository.save(user);
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
        if (validator.isValid(user)) {
//            if (userRepository.findById(user.getId()).isPresent()) {
//                ((LocalRepository) userRepository).update(user);
//            }
            ((LocalRepository) userRepository).update(user);
            return true;
        }
        return false;
    }

    public boolean deleteUser(String id) {
        if (userRepository.findById(id).isPresent()) {
            ((LocalRepository) userRepository).delete(id);
            return true;
        }
        return false;
    }
}
