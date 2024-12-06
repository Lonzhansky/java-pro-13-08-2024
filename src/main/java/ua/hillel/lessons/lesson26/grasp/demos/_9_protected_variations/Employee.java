package ua.hillel.lessons.lesson26.grasp.demos._9_protected_variations;

public class Employee {

    String name;
    String position;
    double wage;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public Employee(String name, String position, double wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getWage() {
        return wage;
    }

}
