package ru.geekbrains.java.lesson8;

import javax.swing.*;
import java.awt.*;

/**
 * Created by esa on 21.02.2017.
 */
public class PaintPanel extends JPanel {

    public PaintPanel() {
        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(20, 20, 100, 100);
    }
}
