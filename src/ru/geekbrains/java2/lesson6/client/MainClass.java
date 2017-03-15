package ru.geekbrains.java2.lesson6.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Eduard on 12.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 8189)) {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                String str = sc.nextLine();
                out.writeUTF(str);
                if (str.equals("end")) break;
                System.out.println("from server: " + in.readUTF());
                out.flush();//можно удалить
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
