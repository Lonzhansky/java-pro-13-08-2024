package ua.hillel.lessons.lesson26.grasp.demos._2_creator.good;

public class Client {

    static String address;
    static int quantity;
    static String name;
    static double price;

    public static void main(String[] args) {
        getData();
        Order order = new Order(address);
        order.addOrderItem(quantity, name, price);
        System.out.printf("Order cost (USD): %.2f%nAddress: %s",
                order.getOrderCost(), order.getAddress());
    }

    private static void getData() {
        address = "Orange St. 7";
        quantity = 5;
        name = "Orange";
        price = 1.99;
    }
}
