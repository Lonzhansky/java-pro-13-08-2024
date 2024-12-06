package ua.hillel.lessons.lesson26.grasp.demos._4_low_coupling.good;

// Клас Traveler тримає посилання
// на інтерфейс Vehicle, а НЕ на конкретний клас.
class Traveler {

    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        vehicle.move();
    }
}
