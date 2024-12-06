package ua.hillel.lessons.lesson26.solid.demos._1_single_responsibility;

class App {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Tom");
        customer.setAddress("Orange St. 7");

        Order order = new Order();
        order.setItemName("Pizza");
        order.setQuantity(2);
        order.setCustomer(customer);

        order.prepareOrder();

        BillCalculation billCalculation =
                new BillCalculation(order);
        billCalculation.calculateBill();

        Delivery delivery = new Delivery(order);
        delivery.delivery();
    }
}
