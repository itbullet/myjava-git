package ru.geekbrains.java2.lesson7.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
    public static void main(String[] args) {
        new MyServer();
    }
}
