package ua.hillel.lessons.lesson26.grasp.demos._2_creator.bad;

public class OrderItem {

    private final Product product;
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getItemCost() {
        return quantity * product.getPrice();
    }
}
