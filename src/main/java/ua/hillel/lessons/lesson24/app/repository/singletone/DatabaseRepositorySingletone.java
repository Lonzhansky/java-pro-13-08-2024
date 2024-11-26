package ua.hillel.lessons.lesson24.app.repository.singletone;

import ua.hillel.lessons.lesson24.app.repository.DatabaseRepository;

public class DatabaseRepositorySingletone {

    private static DatabaseRepository instance;

    private DatabaseRepositorySingletone() {}

    public static DatabaseRepository getInstance() {
        if (instance == null) {
            instance = new DatabaseRepository();
        }
        return instance;
    }

}
