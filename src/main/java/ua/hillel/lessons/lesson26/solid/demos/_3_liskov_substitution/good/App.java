package ua.hillel.lessons.lesson26.solid.demos._3_liskov_substitution.good;

public class App {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.5, 10);
        double area = rectangle.area();
        System.out.println("Rectangle " + area);

        Square square = new Square(5);
        double area1 = square.area();
        System.out.println("Square " + area1);

        Rectangle shape = new Square(3);
        double area2 = shape.area();
        System.out.println("Shape " + area2);

    }
}
