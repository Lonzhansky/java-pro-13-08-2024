package ua.hillel.lessons.lesson25.demos._07_proxy;

// Об'єкт для проксі.
public class BoatReal implements IBoat {

    public void enter(Person person) {
        System.out.println(person + " enters the boat.");
    }

}
