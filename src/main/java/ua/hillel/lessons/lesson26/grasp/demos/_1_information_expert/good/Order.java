package ua.hillel.lessons.lesson26.grasp.demos._1_information_expert.good;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> orderItems;
    private String address;

    public Order(List<OrderItem> orderItems, String address) {
        this.orderItems = orderItems;
        this.address = address;
    }

    public List<OrderItem> getOrderItems() {
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem(new Product("Orange", 1.99), 5));
        orderItems.add(new OrderItem(new Product("Milk", 4.95), 2));
        orderItems.add(new OrderItem(new Product("Rice", 9.97), 1));
        return orderItems;
    }

    public String getAddress() {
        this.address = "Orange St. 7";
        return address;
    }

    public double getOrderCost() {
        orderItems = this.getOrderItems();
        double cost = 0;
        for (OrderItem orderItem : orderItems) {
            cost += orderItem.getCost();
        }
        return cost;
    }
}
