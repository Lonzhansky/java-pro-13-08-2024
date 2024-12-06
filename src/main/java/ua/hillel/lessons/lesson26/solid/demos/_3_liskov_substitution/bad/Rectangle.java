package ua.hillel.lessons.lesson26.solid.demos._3_liskov_substitution.bad;

public class Rectangle {

    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}
