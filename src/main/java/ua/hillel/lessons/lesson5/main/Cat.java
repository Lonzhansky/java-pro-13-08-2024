package ua.hillel.lessons.lesson5.main;

public class Cat extends Animal {

    public final String color;

    public Cat(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " meow!!!");
    }

    @Override
    public final void eat() {
        System.out.println(color + " " + name + " eat!");
    }

    @Override
    public void run() {
        System.out.println("CAT RUN SLOW!!!");
    }

    public void demoFinal(final int x) {
//        x = 5; // ERROR
        System.out.println(x);
    }

}
