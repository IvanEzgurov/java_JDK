package org.example.UI;

import org.example.homework4.Homework4Menu;
import org.example.less5.homework5.HW5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralMenu extends JFrame {
    private static final int WINDOW_HEIGHT = 200;
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_POS_X = 500;
    private static final int WINDOW_POS_Y = 200;


    private final JButton BTN_HOMEWORK_4 = new JButton("Homework 4");
    private final JButton BTN_HOMEWORK_5 = new JButton("Homework 5");
    private final JButton BTN_EXIT = new JButton("Exit program");

    public void generalMenu(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("General Menu");
        setResizable(false);

        JPanel panelButton = new JPanel();
        panelButton.add(BTN_EXIT);
        add(panelButton, BorderLayout.SOUTH);

        JPanel panelTask = new JPanel(new GridLayout(4, 1));
        panelTask.add(BTN_HOMEWORK_4);
        panelTask.add(BTN_HOMEWORK_5);
        add(panelTask, BorderLayout.CENTER);

        setVisible(true);

        BTN_EXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        BTN_HOMEWORK_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Homework4Menu().start();
            }
        });

        BTN_HOMEWORK_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HW5().start();
            }
        });
    }
}
