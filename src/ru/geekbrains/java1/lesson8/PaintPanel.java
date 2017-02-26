package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * Created by esa on 21.02.2017.
 */
public class PaintPanel extends JPanel {
    private BufferedImage bim = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);

    public PaintPanel() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                Graphics g = bim.getGraphics();
                g.setColor(Color.BLUE);
                g.fillOval(5,5, 150, 150);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);

        g.drawImage(bim, 0, 0, this);
        //g.fillRect(2,2, 100,100);
        //setBackground(Color.WHITE);

    }
}
