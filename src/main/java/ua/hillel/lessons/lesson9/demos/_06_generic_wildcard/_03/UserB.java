package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

public class UserB extends User {

    private final String phone;

    public UserB(Integer id, String name, String phone) {
        super(id, name);
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString() + ", phone: " + phone;
    }
}
