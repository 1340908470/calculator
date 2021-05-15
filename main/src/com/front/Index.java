package com.front;

import com.backend.BracketStack;
import com.backend.Calculate;
import com.backend.NumberStack;
import com.backend.SignStack;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Index {
    private JPanel panel1;
    private JButton button1;
    private JButton Del;
    private JButton button3;
    private JButton Reset;
    private JButton LeftBracket;
    private JButton RightBracket;
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

    // 运算
    Calculate calculate = new Calculate();

    public String DisplayText = "";
    public boolean isANS = false;

    public Index() {
        Num0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "0";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "1";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "2";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "3";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "4";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "5";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "6";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "7";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "8";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "9";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Num0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "0";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Point.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += ".";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Div.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "÷";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Mul.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "×";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Sub.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "-";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "+";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        LeftBracket.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += "(";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        RightBracket.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isANS) {
                    DisplayText = "";
                    isANS = false;
                }
                DisplayText += ")";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Equal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isANS = true;
                System.out.println(DisplayText);
                calculate.BasicCalculate(DisplayText);
                DisplayText = "ANS";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Reset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DisplayText = "";
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
        Del.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!DisplayText.equals("")) {
                    DisplayText = DisplayText.substring(0, DisplayText.length()-1);
                }
                textArea1.setText(DisplayText);
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) { e.printStackTrace();

        }

        JFrame frame = new JFrame("FormTest");
        frame.setContentPane(new Index().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}



























