package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

public class Product {

    private final String name;
    private final Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + name +
                ", price EUR " + price;
    }
}
