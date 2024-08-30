package ua.hillel.lessons.lesson5.interfaces;

public interface Interface1 {

    default void method1() {
        System.out.println("DEFAULT METHOD FROM INTERFACE 1");
    }

    static void staticMethod() {
        System.out.println("static method from interface 1");
    }

}
