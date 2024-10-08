package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._02._01;

public class Main {

    public static void main(String[] args) {
        final Customer customer = new Customer();
        MyThreadWithdraw threadWithdraw = new MyThreadWithdraw(customer);
        MyThreadDeposit threadDeposit = new MyThreadDeposit(customer);

        threadWithdraw.start();
        threadDeposit.start();

    }
}
