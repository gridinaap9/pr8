package com.company;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
public class SecondGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Приложение с двумя панелями");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Гридина");
        label1.setFont(new Font("Arial", Font.PLAIN, 28));
        label1.setForeground(Color.PINK);
        panel1.add(label1);
        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Анастасия");
        label2.setFont(new Font("Arial", Font.PLAIN, 30));
        label2.setForeground(Color.CYAN);
        panel2.add(label2);
        frame.getContentPane().add(panel1);
        frame.getContentPane().add(panel2);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);    }
}
