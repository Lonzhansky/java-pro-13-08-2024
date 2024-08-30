package ua.hillel.lessons.lesson5.interfaces;

public class Bird implements Flyible, Eattable, Runnable {

    @Override
    public void demoDefaultMethod() {
        Flyible.super.demoDefaultMethod();
        System.out.println("From class Bird");
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }
}
