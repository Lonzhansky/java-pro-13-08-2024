package ua.hillel.lessons.lesson22.app.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    void save(T item);

    Optional<T> findById(String id);

    List<T> findAll();

}
