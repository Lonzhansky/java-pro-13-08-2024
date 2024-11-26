package ua.hillel.lessons.lesson24.app.repository.factory;

import ua.hillel.lessons.lesson24.app.repository.Repository;
import ua.hillel.lessons.lesson24.app.repository.singletone.DatabaseRepositorySingletone;
import ua.hillel.lessons.lesson24.app.repository.singletone.LocalRepositorySingletone;

public class RepositoryFactory {

    public static Repository<?> getRepository(String argument) {
        return switch (argument) {
            case "-local" -> LocalRepositorySingletone.getInstance();
            case "-db" -> DatabaseRepositorySingletone.getInstance();
            default -> throw new IllegalArgumentException("Unknown repository type" + argument);
        };
    }

}
