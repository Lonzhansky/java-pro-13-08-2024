package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._01_Semaphore._02;

public class WithdrawMoneyTask implements Runnable {

    private final ATMArray atmArray;

    public WithdrawMoneyTask(ATMArray atmArray) {
        this.atmArray = atmArray;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                        + " is about to withdraw money after " +
                "acquiring the permit");

        atmArray.withDrawMoney();
    }
}
