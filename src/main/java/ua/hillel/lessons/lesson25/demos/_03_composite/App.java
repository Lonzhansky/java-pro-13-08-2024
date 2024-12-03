package ua.hillel.lessons.lesson25.demos._03_composite;

public class App {

    public static void main(String[] args) {

        Messenger messenger = new Messenger();

        System.out.println("Message from User A: ");
        messenger.messageFromUserA().print();

        System.out.println("Message from User B: ");
        messenger.messageFromUserB().print();
    }
}
