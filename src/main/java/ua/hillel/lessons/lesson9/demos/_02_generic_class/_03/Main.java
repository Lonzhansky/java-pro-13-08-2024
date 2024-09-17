package ua.hillel.lessons.lesson9.demos._02_generic_class._03;

public class Main {

    public static void main(String[] args) {

        Account<String, Double> acc1 = new Account<>("354", 5000.87);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s  Sum: %.2f %n", id, sum);

        Account<Integer, Double> acc2 = new Account<>(354, 7500.99);
        int id1 = acc2.getId();
        Double sum1 = acc2.getSum();
        System.out.printf("Id: %d  Sum: %.2f %n", id1, sum1);
    }
}
