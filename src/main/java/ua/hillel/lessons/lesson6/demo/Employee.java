package ua.hillel.lessons.lesson6.demo;

public class Employee {

    // Властивості працівника
    String name; // ім'я
    String position; // посада
    int salary; // заробітна платня

    // Параметризований конструктор
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Getters, Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}