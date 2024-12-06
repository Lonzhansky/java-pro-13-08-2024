package ua.hillel.lessons.lesson26.grasp.demos._6_polymorphism._01;

public class Main {

    public static void main(String[] args) {

        // Присвоєння об'єкта Dog змінної animal типу Animal.
        // Це правильно, оскільки Dog обов'язково є Animal.
        Animal animal = new Dog();

        // Це неправильно, тому що Animal не обов'язково
        // є Dog. Можливо і Cat.
//		Dog dog = new Animal();

        // Виклик перевизначеного методу Dog.speak(),
        // який визначено Animal.speak()
        animal.speak();

        // Присвоєння об'єкту Cat змінної animal
        // типу Animal
        animal = new Cat();
        // Виклик перевизначеного методу Cat.speak(),
        // який визначено Animal.speak()
        animal.speak();

        // Масив об'єктів типу Animal може містити будь-який об'єкт,
        // типу Animal чи розширення Animal, наприклад Dog чи Cat.
        Animal[] animals = {new Dog(), new Cat()};

        // Перебір масиву та обробка кожного об'єкта
        // як об'єкта типу Animal.
        for (Animal pet : animals) {
            pet.speak();
        }
    }
}
