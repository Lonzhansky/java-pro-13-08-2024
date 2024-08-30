package ua.hillel.lessons.lesson5.interfaces;

public interface Flyible {

    int DISTANCE = 500;

    void fly();

    default void demoDefaultMethod() {
        System.out.println("demoDefaultMethod");
    }

}
