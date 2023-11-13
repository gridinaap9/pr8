package com.company;
import javax.swing.*;
class FirstGui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Практическая 8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JLabel label = new JLabel("Привет,Мир", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}