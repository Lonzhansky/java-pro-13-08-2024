package ua.hillel.lessons.lesson5.interfaces;

public class DemoClass implements Interface1, Interface2 {

    @Override
    public void method1() {
        Interface2.super.method1();
    }

}
