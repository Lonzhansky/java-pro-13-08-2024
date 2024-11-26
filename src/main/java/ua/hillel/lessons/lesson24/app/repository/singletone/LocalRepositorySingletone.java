package ua.hillel.lessons.lesson24.app.repository.singletone;

import ua.hillel.lessons.lesson24.app.repository.LocalRepository;

public class LocalRepositorySingletone {

    private static LocalRepository instance;

    private LocalRepositorySingletone() {}

    public static LocalRepository getInstance() {
        if (instance == null) {
            instance = new LocalRepository();
        }
        return instance;
    }

}
