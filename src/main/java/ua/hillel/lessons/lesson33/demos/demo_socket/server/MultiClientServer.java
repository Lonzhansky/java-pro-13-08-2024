package ua.hillel.lessons.lesson33.demos.demo_socket.server;

import ua.hillel.lessons.lesson33.demos.demo_socket.utils.Constants;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class MultiClientServer {

    private static final ConcurrentHashMap<String, Socket> activeConnections = new ConcurrentHashMap<>();
    private static int clientCount = 0;

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(Constants.SERVER_PORT)) {

            System.out.println("[SERVER] сервер запущено на порту " + Constants.SERVER_PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                clientCount++;
                String clientName = "client-" + clientCount;

                activeConnections.put(clientName, clientSocket);
                System.out.println("[SERVER] " + clientName + " успішно підключився");

                ClientHandler clientHandler = new ClientHandler(clientSocket, clientName, activeConnections);
                new Thread(clientHandler).start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
