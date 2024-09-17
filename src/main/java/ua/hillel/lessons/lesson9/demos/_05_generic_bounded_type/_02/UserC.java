package ua.hillel.lessons.lesson9.demos._05_generic_bounded_type._02;

public class UserC {

    private final Integer id;
    private final String name;
    private final String phone;
    private final String city;

    public UserC(Integer id, String name, String phone, String city) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserC{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + city + '\'' +
                '}';
    }
}
