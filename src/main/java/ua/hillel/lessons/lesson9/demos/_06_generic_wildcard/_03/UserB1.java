package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

public class UserB1 extends UserB {

    private final String website;

    public UserB1(Integer id, String name,
                  String phone, String website) {
        super(id, name, phone);
        this.website = website;
    }

    @Override
    public String toString() {
        return super.toString() + ", website: " + website;
    }
}
