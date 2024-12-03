package ua.hillel.lessons.lesson25.main._04_builder;

public class Main {

    public static void main(String[] args) {
        Notification notificationTest = new Notification.Builder()
                .setRecipient("alex@gmail.com")
                .setTitle("Notification test")
                .setBody("HELLO!!!!")
                .build();

        System.out.println(notificationTest.toString());


        Notification.Builder builder = new Notification.Builder();
        builder.setRecipient("tom@gmail.com");
        builder.setTitle("title tom");
        builder.setBody("body tom");

        Notification notification = builder.build();

        System.out.println(notification);


        Notification.Builder builder2 = new Notification.Builder();
        builder2.setRecipient("tom@gmail.com")
                .setTitle("title tom")
                .setBody("body tom");

        Notification notification2 = builder2.build();

        System.out.println(notification2);
    }
}
