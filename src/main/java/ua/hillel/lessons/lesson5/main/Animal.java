package ua.hillel.lessons.lesson5.main;

public abstract class Animal {

    public String name;

    protected void eat() {
        System.out.println(name + " eat!");
    }

    public abstract void run();
//    public abstract void run2();
//    public abstract void run3();
//    public abstract void run4();

}
