package ua.hillel.lessons.lesson9.demos._04_generic_method._05.entity;

public class Client {

    private final String name;
    private final String phone;

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client: " + name + ", phone " + phone;
    }
}
