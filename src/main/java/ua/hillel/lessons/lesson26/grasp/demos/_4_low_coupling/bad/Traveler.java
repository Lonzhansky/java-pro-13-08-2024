package ua.hillel.lessons.lesson26.grasp.demos._4_low_coupling.bad;

// Клас Traveler тісно пов'язаний із класом Car,
// оскільки містить посилання на клас Car.
class Traveler {

    Car car = new Car();

    public void startJourney() {
        car.move();
    }
}
