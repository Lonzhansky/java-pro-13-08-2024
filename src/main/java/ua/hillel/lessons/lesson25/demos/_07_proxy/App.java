package ua.hillel.lessons.lesson25.demos._07_proxy;

public class App {

    public static void main(String[] args) {

        BoatRealProxy proxy = new BoatRealProxy(new BoatReal());
        proxy.enter(new Person("Tom"));
        proxy.enter(new Person("Alice"));
        proxy.enter(new Person("Bob"));
        proxy.enter(new Person("Lucy"));
        proxy.enter(new Person("Paul"));

    }
}
