package ua.hillel.lessons.lesson26.grasp.demos._2_creator.good;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<OrderItem> orderItems = new ArrayList<>();
    private final String address;

    public Order(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void addOrderItem(int quantity, String name, double price) {
        orderItems.add(new OrderItem(quantity, name, price));
    }

    public double getOrderCost() {
        double cost = 0;
        for(OrderItem orderItem : orderItems) {
            cost += orderItem.getItemCost();
        }
        return cost;
    }
}
