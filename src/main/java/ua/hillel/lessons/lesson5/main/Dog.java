package ua.hillel.lessons.lesson5.main;

public class Dog extends Animal {

    public void bark() {
        System.out.println(name + " bark");
    }

    @Override
    public void run() {
        System.out.println("DOG RUN FAST!!!");
    }
}
