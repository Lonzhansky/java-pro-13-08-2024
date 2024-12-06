package ua.hillel.lessons.lesson26.grasp.demos._4_low_coupling.good;

class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
