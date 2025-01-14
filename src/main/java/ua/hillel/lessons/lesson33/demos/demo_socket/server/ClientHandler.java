package ua.hillel.lessons.lesson33.demos.demo_socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class ClientHandler implements Runnable {

    private final Socket clientSocket;
    private final String clientName;
    private final ConcurrentHashMap<String, Socket> activeConnections;

    public ClientHandler(Socket clientSocket, String clientName, ConcurrentHashMap<String, Socket> activeConnections) {
        this.clientSocket = clientSocket;
        this.clientName = clientName;
        this.activeConnections = activeConnections;
    }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("[SERVER] отримано від " + clientName + ": " + inputLine);
                if (inputLine.equals("exit")) {
                    System.out.println("[SERVER] " + clientName + " відключився");
                    activeConnections.remove(clientName);
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
