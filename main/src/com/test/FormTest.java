package com.test;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormTest {
    private JPanel panel1;
    private JButton button1;
    private JButton Del;
    private JButton button3;
    private JButton Reset;
    private JButton button5;
    private JButton button6;
    private JButton SwitchSign;
    private JButton Num1;
    private JButton Num4;
    private JButton Num7;
    private JButton button11;
    private JButton Div;
    private JButton Num8;
    private JButton Num9;
    private JButton Mul;
    private JButton Num5;
    private JButton Num6;
    private JButton Sub;
    private JButton Num2;
    private JButton Num3;
    private JButton Add;
    private JButton Num0;
    private JButton Point;
    private JButton Equal;

    private JTextArea textArea1;

    public String text = "";

    public FormTest() {
        Num0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "0";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "1";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "2";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "3";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "4";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "5";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "6";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "7";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "8";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "9";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
        Num0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text += "0";
                textArea1.setText(text);
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormTest");
        frame.setContentPane(new FormTest().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
