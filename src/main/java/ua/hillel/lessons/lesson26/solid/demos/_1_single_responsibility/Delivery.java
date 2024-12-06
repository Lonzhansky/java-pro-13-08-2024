package ua.hillel.lessons.lesson26.solid.demos._1_single_responsibility;

class Delivery {

    private final Order order;

    public Delivery(Order order) {
        this.order = order;
    }

    public void delivery() {
        // Тут взаємодія з іншою системою,
        // яка ставить завдання доставки різним
        // клієнтам залежно від розташування тощо.
        System.out.println("Order delivering...\n"
                + "Order ID: " + this.order.getOrderId()
                + ", client: " + this.order.getCustomer().getName()
                + ", address: "  + this.order.getCustomer().getAddress()
        );
    }
}

