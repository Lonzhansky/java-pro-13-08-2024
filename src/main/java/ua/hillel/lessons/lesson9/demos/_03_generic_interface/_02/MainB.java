package ua.hillel.lessons.lesson9.demos._03_generic_interface._02;

public class MainB {

    public static void main(String[] args) {

        AccountB<Integer> acc1 = new AccountB<>(4568, 5000);
        AccountB<String> acc2 = new AccountB<>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
