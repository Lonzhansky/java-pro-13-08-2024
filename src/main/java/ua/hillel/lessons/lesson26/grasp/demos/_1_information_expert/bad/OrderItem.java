package ua.hillel.lessons.lesson26.grasp.demos._1_information_expert.bad;

public class OrderItem {

    private final Product product;
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return product.getPrice();
    }
}
