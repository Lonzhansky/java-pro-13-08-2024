package ua.hillel.lessons.lesson26.solid.demos._4_interface_segregation.bad;

public class App {

    public static void main(String[] args) {

        System.out.println("Smartphone ___________________");

        Smartphone smartphone = new Smartphone();
        smartphone.mouseover("Mouse click");
        smartphone.touch("Touch");
        smartphone.swipe("Swipe");
        smartphone.validate();

        System.out.println("Desktop ______________________");

        Desktop desktop = new Desktop();
        desktop.mouseover("Mouse click");
        desktop.touch("Touch");
        desktop.swipe("Swipe");
        desktop.validate();

    }
}
