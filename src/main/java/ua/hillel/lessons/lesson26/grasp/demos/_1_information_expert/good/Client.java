package ua.hillel.lessons.lesson26.grasp.demos._1_information_expert.good;

import java.util.ArrayList;

public class Client {

    static String address;

    public static void main(String[] args) {
        Order order = new Order(new ArrayList<>(), address);
        String address = order.getAddress();
        System.out.printf("Order cost (USD): %.2f%nAddress: %s",
                order.getOrderCost(), address);
    }
}
