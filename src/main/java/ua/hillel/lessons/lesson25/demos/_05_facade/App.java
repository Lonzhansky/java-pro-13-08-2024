package ua.hillel.lessons.lesson25.demos._05_facade;

public class App {

    public static void main(String[] args) {
        PlantFacade facade = new PlantFacade();
        facade.startDay();
        facade.makeProduct();
        facade.endDay();
    }
}
