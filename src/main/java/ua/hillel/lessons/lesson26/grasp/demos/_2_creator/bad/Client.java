package ua.hillel.lessons.lesson26.grasp.demos._2_creator.bad;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static String address;

    public static void main(String[] args) {

        Product product = new Product("Orange", 2.95);
        OrderItem orderItem = new OrderItem(product,5);

        Product product1 = new Product("Milk", 5.99);
        OrderItem orderItem1 = new OrderItem(product1,1);

        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        orderItems.add(orderItem1);

        Order order = new Order(orderItems, address);
        String address = order.getAddress();

        System.out.printf("Order cost (USD): %.2f%nAddress: %s",
                order.getOrderCost(), address);
    }
}
