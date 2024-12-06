package ua.hillel.lessons.lesson26.grasp.demos._2_creator.bad;

import java.util.List;

public class Order {

    private final List<OrderItem> orderItems;
    private String address;

    public Order(List<OrderItem> orderItems, String address) {
        this.orderItems = orderItems;
        this.address = address;
    }

    public String getAddress() {
        this.address = "Orange St. 7";
        return address;
    }

    public double getOrderCost() {
        double cost = 0;
        for(OrderItem orderItem : orderItems) {
            cost += orderItem.getItemCost();
        }
        return cost;
    }
}
