package ua.hillel.lessons.lesson9.demos._05_generic_bounded_type._02;

class Main {

    public static void main(String[] args) {

        // UserA - спадкоємець User
        User user = new User(5, "Alice");
        Outputer<User> outputer = new Outputer<>();
        outputer.getOutput(user);

        // UserA - спадкоємець User
        UserA userA = new UserA(5, "Alice", "alice@mail.com");
        Outputer<UserA> outputer1 = new Outputer<>();
        outputer1.getOutput(userA);

        // UserB - спадкоємець User
        UserB userB = new UserB(8, "Bob", "555 123-6985");
        Outputer<UserB> outputer2 = new Outputer<>();
        outputer2.getOutput(userB);

        // ПОМИЛКА!
        // UserC - НЕ спадкоємець User
//        UserC userC = new UserC(4, "Tom", "555 123-6985", "London");
//        Outputer<UserC> outputer3 = new Outputer<>();
//        outputer3.getOutput(userC);

    }
}
