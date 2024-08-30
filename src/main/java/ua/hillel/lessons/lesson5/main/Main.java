package ua.hillel.lessons.lesson5.main;

import ua.hillel.lessons.lesson5.interfaces.Bird;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("White");
//        cat.name = "Tom";
//        cat.eat();
//        cat.meow();
//        cat.run();

//        Dog dog = new Dog();
//        dog.name = "Barsik";
//        dog.run();

//        dog.eat();
//        dog.bark();
//        dog.meow();

//        Animal animal = new Animal();
//        animal.name = "animal";
//        animal.meow(); // ERROR!!!


        Animal cat = new Cat("White");
        Animal dog = new Dog();
        cat.name = "Tom";
        dog.name = "Barsik";

        printAnimalName(cat);
        printAnimalName(dog);
    }

    static void printAnimalName(Animal animal) {
        System.out.println(animal.name);

        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        }

        if (animal.getClass() == Cat.class) {
            ((Cat) animal).meow();
        }

    }
}
