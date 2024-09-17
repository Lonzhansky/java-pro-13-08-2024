package ua.hillel.lessons.lesson9.demos._05_generic_bounded_type._02;

public class UserA extends User {

    private final String email;

    public UserA(Integer id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserA{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
