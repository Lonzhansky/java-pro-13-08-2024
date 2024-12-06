package ua.hillel.lessons.lesson26.solid.demos._3_liskov_substitution.good;

public class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

}
