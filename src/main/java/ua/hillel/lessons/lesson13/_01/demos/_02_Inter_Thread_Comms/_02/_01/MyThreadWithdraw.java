package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._02._01;

public class MyThreadWithdraw extends Thread {

    Customer customer;

    public MyThreadWithdraw(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        customer.withdraw(15000);
    }
}
