package ua.hillel.lessons.lesson4.car;

import java.util.Objects;

public class Car {

    private String modelName;
    int year;
    protected boolean engineStarted;
    public String carCode;
    private double fuelLevel;

    public Car(String modelName, int year, String carCode) {
        this.modelName = modelName;
        this.year = year;
        this.carCode = carCode;
        engineStarted = false;
        fuelLevel = 50.0;
    }

    public Car(String modelName, int year, String carCode, double fuelLevel) {
        this.modelName = modelName;
        this.year = year;
        this.carCode = carCode;
        engineStarted = false;
        this.fuelLevel = fuelLevel;
    }

    public void startCar() {
        if (checkFuelLevel() && checkEngine()) {
            startEngine();
            System.out.println("Автомобіль успішно запущено!");
        } else {
            System.out.println("Не вдалося запустити автомобіль");
        }
    }

    private boolean checkFuelLevel() {
        if (fuelLevel > 0) {
            System.out.println("Рівень пального достатній");
            return true;
        } else {
            System.out.println("Рівень пального занадто низький");
            return false;
        }
    }

    private boolean checkEngine() {
        System.out.println("Стан двигуна: " + (engineStarted ? "Вже запущено" :  "Готовий до запуску"));
        return !engineStarted;
    }

    private void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
            System.out.println("Двигун запущено");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel < 0) {
            System.out.println("Не може бути менше 0");
        } else {
            this.fuelLevel = fuelLevel;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && engineStarted == car.engineStarted && Double.compare(fuelLevel, car.fuelLevel) == 0 && Objects.equals(modelName, car.modelName) && Objects.equals(carCode, car.carCode);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", year=" + year +
                ", engineStarted=" + engineStarted +
                ", carCode='" + carCode + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

}
