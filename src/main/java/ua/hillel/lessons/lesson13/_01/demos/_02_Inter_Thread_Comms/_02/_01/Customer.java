package ua.hillel.lessons.lesson13._01.demos._02_Inter_Thread_Comms._02._01;

public class Customer {

    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw...");
        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                System.out.println(Thread.currentThread().getName() + " waiting...");
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed... ");
        System.out.println(Thread.currentThread().getName() + " notify...");
        notify();
    }
}
