package ua.hillel.lessons.lesson12.demos._06_Problems._03_Livelock;

public class Shop {

    private boolean orderShipped = false;

    public void shipOrder(Customer customer) {
        while (!customer.isPaid()) {
            System.out.println("waiting for money");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " +
                        e.getMessage());
            }
        }
        setOrderShipped(true);
    }

    public void setOrderShipped(boolean orderShipped) {
        this.orderShipped = orderShipped;
    }

    public boolean isOrderShipped() {
        return orderShipped;
    }
}
