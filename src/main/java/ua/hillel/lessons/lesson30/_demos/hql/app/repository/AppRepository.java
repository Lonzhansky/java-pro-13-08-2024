package ua.hillel.lessons.lesson30._demos.hql.app.repository;

import java.util.List;
import java.util.Optional;

public interface AppRepository<T> {
    String create(T obj);
    Optional<List<T>> read();
    String update(T obj);
    String delete(Long id);
    Optional<T> readById(Long id);
}
