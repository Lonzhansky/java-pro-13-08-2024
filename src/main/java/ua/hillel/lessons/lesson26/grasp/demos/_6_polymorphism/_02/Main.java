package ua.hillel.lessons.lesson26.grasp.demos._6_polymorphism._02;

// Перезапустіть програму кілька разів.
// Повинні виводитися різні результати.
public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();

        int rand = (int) (Math.random() * 4);

        if (rand == 0) {
            // animal - посилання animal на animal типу Dog.
            animal = new Dog();
        } else if (rand == 1) {
            // animal - посилання animal на animal типу Cat.
            animal = new Cat();
        } else if (rand == 2) {
            // animal - посилання animal на animal типу Racoon.
            animal = new Racoon();
        }
        // На яку б тварину animal не посилалася,
        // викликається його метод speak().
        animal.speak();
    }
}
