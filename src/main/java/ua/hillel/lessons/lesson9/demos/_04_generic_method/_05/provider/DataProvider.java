package ua.hillel.lessons.lesson9.demos._04_generic_method._05.provider;

import ua.hillel.lessons.lesson9.demos._04_generic_method._05.entity.Client;
import ua.hillel.lessons.lesson9.demos._04_generic_method._05.entity.Product;

// Надання значень через різний тип масиву
public class DataProvider {

    public Client[] getClients() {
        return new Client[]{
                new Client("Tom", "555 123-8574"),
                new Client("Linda", "555 004-5522"),
                new Client("Denis", "555 777-1001"),
                new Client("Bob", "555 322-5252"),
                new Client("Alice", "555 404-2571")
        };
    }

    public Product[] getProducts() {
        return new Product[]{
                new Product("orange", 1.95),
                new Product("plum", 2.25),
                new Product("mango", 5.99),
                new Product("kiwi", 3.95)
        };
    }
}
