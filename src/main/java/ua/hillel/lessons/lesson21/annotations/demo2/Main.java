package ua.hillel.lessons.lesson21.annotations.demo2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Audi(),
                new Mercedes(),
                new Bmw()
        };

        System.out.println("Cars cant ride on days");
        for (Car car : cars) {
            Class<? extends Car> clazz = car.getClass();
            System.out.println("car: " + clazz.getSimpleName());
            CarBan annotation = clazz.getAnnotation(CarBan.class);
            for (CarDays day : annotation.days()) {
                System.out.println(day);
            }
            System.out.println();
        }
    }
}
