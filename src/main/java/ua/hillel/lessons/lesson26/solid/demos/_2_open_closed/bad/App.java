package ua.hillel.lessons.lesson26.solid.demos._2_open_closed.bad;

import java.util.ArrayList;
import java.util.List;

// Формування замовлення
public class App {

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

        Product product1 = new Product();
        product1.setName("Orange");
        product1.setType("food");
        product1.setPrice(2.95);
        products.add(product1);

        Product product2 = new Product();
        product2.setName("Milk");
        product2.setType("food");
        product2.setPrice(7.95);
        products.add(product2);

        Product product3 = new Product();
        product3.setName("T-shirt");
        product3.setType("garment");
        product3.setPrice(12.99);
        products.add(product3);

        Product product4 = new Product();
        product4.setName("Smartphone");
        product4.setType("electronics");
        product4.setPrice(230.97);
        products.add(product4);

        return products;
    }

    public static double calculateTotalOrder(List<Product> products) {

        double orderTotal = 0;

        for (Product product : products) {
            if ("food".equals(product.getType())) {
                // Підрахунок суми за категорією (ціна + податок з продажів)
                orderTotal += product.getPrice() + product.getPrice() * 5 / 100;
            } else if ("garment".equals(product.getType())) {
                // Підрахунок суми за категорією (ціна + податок з продажів)
                orderTotal += product.getPrice() + product.getPrice() * 10 / 100;
            } else if ("electronics".equals(product.getType())) {
                // Підрахунок суми за категорією (ціна + податок з продажів + поштовий податок)
                orderTotal += product.getPrice() + product.getPrice() * 15 / 100 +
                        product.getPrice() * 3 / 100;
            }
        }

        return orderTotal;
    }
}
