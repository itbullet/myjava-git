package ru.geekbrains.java2.lesson4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Eduard on 08.03.2017.
 */
public class myForm extends JFrame {
    public myForm() {
        setBounds(500, 200, 800, 600);
        setTitle("GUI Demo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        JPanel[] jp = new JPanel[4];
        for (int i = 0; i < 4; i++) {
            jp[i] = new JPanel();
            add(jp[i]);
            jp[i].setBackground(new Color(100 + i * 40, 100 + i * 40, 100 + i * 40));
        }
        //////////////////////////////////////////////////////////
        jp[0].setLayout(new BorderLayout());
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        jp[0].add(jsp);
        //////////////////////////////////////////////////////////
        jp[1].setLayout(new FlowLayout());
        JRadioButton[] jrb = new JRadioButton[4];
        ButtonGroup bgr = new ButtonGroup();
        for (int i = 0; i < jrb.length; i++) {
            jrb[i] = new JRadioButton("Option #" + i);
            bgr.add(jrb[i]);
            jp[1].add(jrb[i]);
        }
        JCheckBox[] jcb = new JCheckBox[4];
        for (int i = 0; i < jcb.length; i++) {
            jcb[i] = new JCheckBox("Check #" + i);
            jp[1].add(jcb[i]);
        }
        //////////////////////////////////////////////////////////
        jp[2].setLayout(new FlowLayout());
        String[] comboStr = {"Item #1", "Item #2", "Item #3", "Item #4"};
        JComboBox<String> jcombo1 = new JComboBox<String>(comboStr);
        JComboBox<String> jcombo2 = new JComboBox<String>(comboStr);
        jp[2].add(jcombo1);
        jp[2].add(jcombo2);
        jcombo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jcombo1.getSelectedItem().toString());
            }
        });
        /////////////////////////////////////////////////////////////
        jp[3].setLayout(null);
        JSlider js = new JSlider();
        JLabel jlab = new JLabel("Value: 50");
        js.setMaximum(100);
        js.setMinimum(0);
        js.setValue(50);
        jp[3].add(jlab);
        jp[3].add(js);
        js.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jlab.setText("Value: " + js.getValue());
            }
        });
        jlab.setBounds(10, 10, 100, 20);
        js.setBounds(20, 50, 300, 100);
        js.setBackground(new Color(160, 255, 160));
        ////////////////////////////////////////////////////////////
        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileExit = new JMenuItem("Exit");
        setJMenuBar(mainMenu);
        mainMenu.add(mFile);
        mainMenu.add(mEdit);
        mFile.add(miFileNew);
        mFile.addSeparator(); // разделительная линия
        mFile.add(miFileExit);
        miFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("BYE");
            }
        });

        setVisible(true);
    }
}
