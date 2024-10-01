package ua.hillel.lessons.lesson12.demos._06_Problems._03_Livelock;

public class Customer {

    private boolean paid = false;

    public void payMoney(Shop shop) {
        while (!shop.isOrderShipped()) {
            System.out.println("waiting for order");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception: " +
                        e.getMessage());
            }
        }
        setPaid(true);
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
