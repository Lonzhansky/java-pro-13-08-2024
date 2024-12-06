package ua.hillel.lessons.lesson26.solid.demos._1_single_responsibility;

import java.util.Random;

class Order {

    private Customer customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBillAmt;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        Random random = new Random();
        this.orderId = orderId + "-" + random.nextInt(400);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        setOrderId(itemName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalBillAmt() {
        return totalBillAmt;
    }

    public void setTotalBillAmt(int totalBillAmt) {
        this.totalBillAmt = totalBillAmt;
    }

    public void prepareOrder() {
        System.out.println("Preparing an order for a customer: "
                + this.getCustomer().getName()
                + ", order: "
                + this.getItemName()
        );
    }
}
