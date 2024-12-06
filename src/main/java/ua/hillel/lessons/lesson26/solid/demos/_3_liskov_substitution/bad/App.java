package ua.hillel.lessons.lesson26.solid.demos._3_liskov_substitution.bad;

public class App {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5.5);
        rectangle.setWidth(10);
        double area = rectangle.area();
        System.out.println("Rectangle " + area);

        Square square = new Square();
        square.setHeight(5);
        square.setWidth(5);
        double area1 = square.area();
        System.out.println("Square " + area1);

        Rectangle shape = new Square();
        shape.setHeight(3);
        shape.setWidth(4);
        double area2 = shape.area();
        System.out.println("Shape " + area2);

    }
}
