package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * Created by esa on 21.02.2017.
 */
public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("My First Program with GUI");
        setBounds(800, 300, 500, 500);
        //Команда ниже размещает окно по центру экрана
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(3, 3));
        PaintPanel jpLeftUp = new PaintPanel();
        jpLeftUp.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpLeftUp);
        PaintPanel jpLeft = new PaintPanel();
        jpLeft.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpLeft);
        PaintPanel jpLeftBottom = new PaintPanel();
        jpLeftBottom.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpLeftBottom);
        PaintPanel jpMiddleUp = new PaintPanel();
        jpMiddleUp.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpMiddleUp);
        PaintPanel jpMiddle = new PaintPanel();
        jpMiddle.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpMiddle);
        PaintPanel jpMiddleBottom = new PaintPanel();
        jpMiddleBottom.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpMiddleBottom);
        PaintPanel jpRightUp = new PaintPanel();
        jpRightUp.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpRightUp);
        PaintPanel jpRight = new PaintPanel();
        jpRight .setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpRight);
        PaintPanel jpRightBottom = new PaintPanel();
        jpRightBottom.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jpRightBottom);

        /*JPanel jpLeft = new JPanel();
        add(jpLeft);
        jpLeft.setBackground(Color.LIGHT_GRAY);
        jpLeft.setBorder(new LineBorder(Color.DARK_GRAY, 1));
        jpLeft.setLayout(new BoxLayout(jpLeft, BoxLayout.Y_AXIS));
        JButton btn1 = new JButton("Button #1");
        jpLeft.add(btn1);
        JButton btn2 = new JButton("Button #2");
        jpLeft.add(btn2);
        JButton btn3 = new JButton("Button #3");
        jpLeft.add(btn3);

        JPanel jpRight = new JPanel(new CardLayout());
        add(jpRight);

        PaintPanel jpRed = new PaintPanel();
        jpRed.setBackground(Color.WHITE);
        JPanel jpYellow = new JPanel();
        jpYellow.setBackground(Color.YELLOW);
        JPanel jpGreen = new JPanel();
        jpGreen.setBackground(Color.GREEN);

        jpRight.add(jpRed, "RED");
        jpRight.add(jpYellow, "YELLOW");
        jpRight.add(jpGreen, "GREEN");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpRight.getLayout()).show(jpRight, "RED");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpRight.getLayout()).show(jpRight, "YELLOW");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpRight.getLayout()).show(jpRight, "GREEN");
            }
        });
*/
        setVisible(true);
    }

}
