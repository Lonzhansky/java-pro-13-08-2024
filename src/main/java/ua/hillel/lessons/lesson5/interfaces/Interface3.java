package ua.hillel.lessons.lesson5.interfaces;

public interface Interface3 extends Interface1, Interface2 {

    void method3();

    @Override
    default void method1() {
        System.out.println("FROM interface 3");
    }


    static void staticMethod() {
        System.out.println("static method from interface 3");
    }

}
