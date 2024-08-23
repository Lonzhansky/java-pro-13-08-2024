package ua.hillel.lessons.lesson4.car.electric;

import ua.hillel.lessons.lesson4.car.Car;

public class ElectricCar extends Car {

    public ElectricCar(String modelName, int year, String carCode) {
        super(modelName, year, carCode);
    }

    public void printEngineStatus() {
        System.out.println(engineStarted ? "Двигун запущено" : "Двигун не запущено");
    }

}
