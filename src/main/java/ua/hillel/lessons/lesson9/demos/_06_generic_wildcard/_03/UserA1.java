package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

public class UserA1 extends UserA {

    private final String address;

    public UserA1(Integer id, String name,
                  String email, String address) {
        super(id, name, email);
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + ", address: " + address;
    }
}
