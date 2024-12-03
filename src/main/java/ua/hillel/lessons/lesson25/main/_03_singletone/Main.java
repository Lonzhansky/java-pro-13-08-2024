package ua.hillel.lessons.lesson25.main._03_singletone;

public class Main {
    public static void main(String[] args) {

        NotificationManager instance = NotificationManager.getInstance();

        instance.send("qweqwe");


        NotificationManager instance2 = NotificationManager.getInstance();
        NotificationManager instance3 = NotificationManager.getInstance();


        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());

    }
}
