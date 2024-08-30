package ua.hillel.lessons.lesson5.interfaces;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.demoDefaultMethod();


        System.out.println(Flyible.DISTANCE);

        Interface1.staticMethod();
        Interface3.staticMethod();

    }
}
