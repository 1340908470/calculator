package com.test;

import javax.swing.*;

public class JFrameTest {
    public static void main(String[] args) {
        // 创建JFrame
        JFrame jf = new JFrame("计算器");
        jf.setBounds(400, 300, 400, 250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建JDialog
        JDialog jd = new JDialog(jf, "dialog");

    }
}
