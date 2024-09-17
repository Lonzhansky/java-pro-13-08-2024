package ua.hillel.lessons.lesson9.demos._02_generic_class._02;

public class Main {

    public static void main(String[] args) {
        Account acc1 = new Account("cis2373", 5000);
        Account acc2 = new Account(53757, 4000);
        System.out.println("Id is " + acc1.getId());
        System.out.println("Id is " + acc2.getId() + ", " +
                "sum is USD " + acc2.getSum());
    }
}
