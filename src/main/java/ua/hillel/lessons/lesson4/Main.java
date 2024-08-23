package ua.hillel.lessons.lesson4;

import ua.hillel.lessons.lesson4.car.Car;
import ua.hillel.lessons.lesson4.car.electric.ElectricCar;

public class Main {

    public static void main(String[] args) throws Throwable {
        Car car = new Car("BMW X5", 2020, "WC65656", 75.0);
        Car car2 = new Car("BMW X5", 2020, "WC65656", 75.0);

//        car.startCar();
//
//        System.out.println("fuel level = " + car.getFuelLevel());
//        System.out.println("model name = " + car.getModelName());
//        System.out.println("engine started = " + car.isEngineStarted());
//
//        car.setFuelLevel(55.5);
//
//        System.out.println("fuel level = " + car.getFuelLevel());


        System.out.println(car);



//        ElectricCar electricCar = new ElectricCar(" Tesla Modex S", 2022, "WC656sfdsdf56");
//        electricCar.printEngineStatus();
    }
}
