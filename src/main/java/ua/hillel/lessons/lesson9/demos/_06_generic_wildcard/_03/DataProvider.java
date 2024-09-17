package ua.hillel.lessons.lesson9.demos._06_generic_wildcard._03;

import java.util.Arrays;
import java.util.List;

// Кожен метод повертає набір (колекцію) об'єктів певного типу
public class DataProvider {

    public List<User> getUserData() {
        return Arrays.asList(
                new User(5, "Tom"),
                new User(8, "Alice"),
                new User(12, "Bob")
        );
    }

    public List<UserA> getUserAData() {
        return Arrays.asList(
                new UserA(5, "Tom", "tom@mail.com"),
                new UserA(8, "Alice", "alice@mail.com"),
                new UserA(12, "Bob", "bob@mail.com")
        );
    }

    public List<UserA1> getUserA1Data() {
        return Arrays.asList(
                new UserA1(5, "Tom", "tom@mail.com", "London"),
                new UserA1(8, "Alice", "alice@mail.com", "Paris"),
                new UserA1(12, "Bob", "bob@mail.com", "Madrid")
        );
    }

    public List<UserB> getUserBData() {
        return Arrays.asList(
                new UserB(5, "Tom", "555 123-8596"),
                new UserB(8, "Alice", "555 222-4152"),
                new UserB(12, "Bob", "555 421-8899")
        );
    }

    public List<UserB1> getUserB1Data() {
        return Arrays.asList(
                new UserB1(5, "Tom", "tom@mail.com", "www.tom.com"),
                new UserB1(8, "Alice", "alice@mail.com", "www.alice.com"),
                new UserB1(12, "Bob", "bob@mail.com", "www.bob.com")
        );
    }
    
    public List<Product> getProductData() {
        return Arrays.asList(
                new Product("orange", 2.99),
                new Product("apple", 1.95),
                new Product("grape", 5.29)
        );
    }

}
