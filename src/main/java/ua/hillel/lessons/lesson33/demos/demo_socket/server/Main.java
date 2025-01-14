package ua.hillel.lessons.lesson33.demos.demo_socket.server;

public class Main {
    public static void main(String[] args) {

        new Thread(() -> {
            MultiClientServer server = new MultiClientServer();
            server.start();
        }).start();

    }
}
