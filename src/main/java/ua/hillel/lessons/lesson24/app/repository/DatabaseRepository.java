package ua.hillel.lessons.lesson24.app.repository;

import ua.hillel.lessons.lesson24.app.model.User;

import java.util.List;
import java.util.Optional;

public class DatabaseRepository implements Repository<User> {

    @Override
    public void save(User item) {
        throw new IllegalArgumentException("SOON!!!");
    }

    @Override
    public Optional<User> findById(String id) {
        throw new IllegalArgumentException("SOON!!!");
    }

    @Override
    public List<User> findAll() {
        throw new IllegalArgumentException("SOON!!!");
    }
}
