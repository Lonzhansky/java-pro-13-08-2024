package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._02._01;

public class MyThreadDeposit extends Thread {

    Customer customer;

    public MyThreadDeposit(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        customer.deposit(10000);
    }
}
