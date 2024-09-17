package ua.hillel.lessons.lesson9.demos._05_generic_bounded_type._02;

public class UserB extends User {

    private final String phone;

    public UserB(Integer id, String name, String phone) {
        super(id, name);
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserB{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
