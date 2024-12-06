package ua.hillel.lessons.lesson26.grasp.demos._1_information_expert.bad;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static String address;

    public static void main(String[] args) {
        Order order = new Order(new ArrayList<>(), address);
        address = order.getAddress();
        double orderCost = getOrderCost(order);
        System.out.printf("Order cost (USD): %.2f%nAddress: %s",
                orderCost, address);
    }

    private static double getOrderCost(Order order) {
        List<OrderItem> orderItems = order.getOrderItems();
        double cost = 0;
        for (OrderItem orderItem : orderItems) {
            double price = orderItem.getPrice();
            double quantity = orderItem.getQuantity();
            cost += price * quantity;
        }
        return cost;
    }
}
