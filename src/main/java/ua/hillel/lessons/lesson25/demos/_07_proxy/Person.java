package ua.hillel.lessons.lesson25.demos._07_proxy;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
