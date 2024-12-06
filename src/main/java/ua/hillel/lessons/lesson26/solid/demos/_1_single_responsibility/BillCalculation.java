package ua.hillel.lessons.lesson26.solid.demos._1_single_responsibility;

import java.util.Random;

class BillCalculation {

    private final Order order;

    public BillCalculation(Order order) {
        this.order = order;
    }

    public void calculateBill() {
        // За допомогою Random моделюється випадкове число
        // як загальна сума замовлення.
        // Оскільки, у реальному світі, загальну суму замовлення
        // формують окремі елементи замовлення, вартість доставки
        // та сума податку.
        Random rand = new Random();
        int totalAmt = rand.nextInt(300) * this.order.getQuantity();

        this.order.setTotalBillAmt(totalAmt);

        System.out.println("Order ID: "
                + this.order.getOrderId()
                + ", sum: "
                + this.order.getTotalBillAmt());
    }
}
