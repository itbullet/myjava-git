package ru.geekbrains.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            Socket socket = null;
            while(true) {
                System.out.println("Сервер ожидает подключения");
                socket = serverSocket.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(socket);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе сервера");
        }
    }
}
