package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

public class UserA extends User {

    private final String email;

    public UserA(Integer id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", email: " + email ;
    }
}
