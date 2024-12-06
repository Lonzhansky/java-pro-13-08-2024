package ua.hillel.lessons.lesson26.solid.demos._2_open_closed.good;

import java.util.ArrayList;
import java.util.List;

// Формування замовлення
public class App {

    static Product product;

	static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        products = getProducts();

        double orderSum = calculateTotalOrder(products);

        for (Product item : products) {
            System.out.println(item.getName() + " " + item.getType()
                    + " " + item.getPrice());
        }

        System.out.printf("----------------%n" +
                "TOTAL, USD: %.2f", orderSum);

    }

    public static List<Product> getProducts() {

        product = new Food();
        product.setName("Orange");
        product.setPrice(2.95);
        products.add(product);

        product = new Food();
        product.setName("Milk");
        product.setPrice(7.95);
        products.add(product);

        product = new Garment();
        product.setName("T-shirt");
        product.setPrice(12.99);
        products.add(product);

        product = new Electronics();
        product.setName("Smartphone");
        product.setPrice(230.97);
        products.add(product);

        return products;
    }

    public static double calculateTotalOrder(List<Product> products) {
        double orderTotal = 0;
        for (Product product : products) {
            orderTotal += product.calculatePriceWithTax();
        }
        return orderTotal;
    }
}
