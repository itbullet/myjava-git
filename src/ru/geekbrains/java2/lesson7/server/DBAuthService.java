package ru.geekbrains.java2.lesson7.server;

import java.sql.*;

public class DBAuthService implements AuthService {
    private Connection connection;
    private PreparedStatement ps;

    public void start() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:chat.db");
            ps = connection.prepareStatement("SELECT Nick FROM entries WHERE Login = ? AND Pass = ?;");
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getNickByLoginPass(String login, String pass) {
        try {
            ps.setString(1, login);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void stop() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
