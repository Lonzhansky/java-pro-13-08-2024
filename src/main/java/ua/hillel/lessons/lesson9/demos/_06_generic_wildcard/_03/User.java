package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

public class User {

    private final Integer id;
    private final String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                ", " + name;
    }
}
