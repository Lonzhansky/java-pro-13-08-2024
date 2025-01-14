package ua.hillel.lessons.lesson33.demos.demo_socket.client;

import ua.hillel.lessons.lesson33.demos.demo_socket.utils.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
    public static void main(String[] args) {
        try (Socket socket = new Socket(Constants.HOST, Constants.SERVER_PORT)) {

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("[CLIENT] підключення до сервера");

            String userCommand;
            while (true) {
                System.out.println("Введіть команду або exit для виходу");
                userCommand = userInput.readLine();
                out.println(userCommand);

                if ("exit".equals(userCommand)) {
                    System.out.println("[CLIENT] Вихід з програми");
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
