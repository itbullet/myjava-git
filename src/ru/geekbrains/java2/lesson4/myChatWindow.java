package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Eduard on 08.03.2017.
 */
public class myChatWindow extends JFrame{
    private JTextArea jta;
    private JTextField jtf;

    public myChatWindow() {
        setBounds(1000, 400, 400, 400);
        setTitle("Chat Room");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jBottom = new JPanel(new BorderLayout());
        jtf = new JTextField();
        jBottom.add(jtf, BorderLayout.CENTER);
        JButton jbSend = new JButton("Send Message");
        jBottom.add(jbSend, BorderLayout.EAST);
        add(jBottom, BorderLayout.SOUTH);
        jta = new JTextArea();
        jta.setEditable(false);
        jta.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp, BorderLayout.CENTER);

        jbSend.addActionListener(e -> sendMsg());
        jtf.addActionListener(e -> sendMsg());

        setVisible(true);
        jtf.grabFocus();
    }

    public void sendMsg(){
        String str = jtf.getText();
        jtf.setText("");
        jta.append(str + "\n");
        jtf.grabFocus();
    }
}
