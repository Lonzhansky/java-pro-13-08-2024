package ua.hillel.lessons.lesson22.app.repository;

import ua.hillel.lessons.lesson22.app.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocalRepository implements Repository<User> {

    private final List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        if (findById(user.getId()).isEmpty()) {
            users.add(user);
        } else {
            throw new IllegalArgumentException("User with ID " + user.getId() + " already exist!!!");
        }
    }

    @Override
    public Optional<User> findById(String id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    public void update(User user) {
        Optional<User> existingUser = findById(user.getId());
        if (existingUser.isPresent()) {
            users.remove(existingUser.get());
            users.add(user);
        } else {
            throw new IllegalArgumentException("User with ID " + user.getId() + " not found!!!");
        }
    }

    public void delete(String id) {
        Optional<User> existingUser = findById(id);
        if (existingUser.isPresent()) {
            users.remove(existingUser.get());
        } else {
            throw new IllegalArgumentException("User with ID " + id + " not found!!!");
        }
    }

}
